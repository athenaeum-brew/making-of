import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelVsSequentialSum {
    public static void main(String[] args) {
        int[] array = new int[10_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Populate the array with values from 1 to 10,000,000
        }

        // Pre-create threads
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        // Warm-up phase: Perform a parallel sum computation to warm up the thread pool
        forkJoinPool.invoke(new SumTask(array, 0, array.length));

        // Sequential sum computation
        long startTime = System.currentTimeMillis();
        long sequentialSum = 0;
        for (int num : array) {
            sequentialSum += num;
        }
        long endTime = System.currentTimeMillis();
        long sequentialTime = endTime - startTime;
        System.out.println("\n->\nSequential sum: " + sequentialSum);
        System.out.println("Sequential execution time: " + sequentialTime + " ms");

        // Parallel sum computation
        System.out.println("\n-> (Thread pool size: " + forkJoinPool.getParallelism() + ")");
        startTime = System.currentTimeMillis();
        long parallelSum = forkJoinPool.invoke(new SumTask(array, 0, array.length));
        endTime = System.currentTimeMillis();
        long parallelTime = endTime - startTime;
        System.out.println("Parallel sum: " + parallelSum);
        System.out.println("Parallel execution time: " + parallelTime + " ms");

        // Compare execution times
        double speedup = (double) sequentialTime / parallelTime;
        String speedupString = String.format("Speedup factor: %.2f", speedup); // two decimals speedup factor

        // ANSI escape codes for colors
        String redColor = "\u001B[31m";
        String greenColor = "\u001B[32m";
        String resetColor = "\u001B[0m";

        // Determine color based on speedup factor
        String colorCode = (speedup < 1) ? redColor : (speedup > 1) ? greenColor : "";

        // Print speedup factor with color
        System.out.println("\n" + colorCode + speedupString + resetColor + "\n");
    }

    static class SumTask extends RecursiveTask<Long> {
        private static final int SEQUENTIAL_THRESHOLD = 10_000;
        private int[] array;
        private int start;
        private int end;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            if (end - start <= SEQUENTIAL_THRESHOLD) {
                // Sequential computation
                long sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else {
                // Divide the array into halves and invoke new tasks recursively
                int mid = (start + end) / 2;
                SumTask leftTask = new SumTask(array, start, mid);
                SumTask rightTask = new SumTask(array, mid, end);
                leftTask.fork();
                rightTask.fork();
                return leftTask.join() + rightTask.join();
            }
        }
    }
}
