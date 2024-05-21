import java.math.BigInteger;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class FibonacciStreams {
    public static void main(String[] args) {

        System.out.println(BigInteger.ZERO);
        streamFibonacci().limit(11).forEach(System.out::println);

        int nthFibonacciNumber = 120; // Change this to get a different Fibonacci number
        BigInteger fibonacciNumber = streamFibonacci()
                .limit(nthFibonacciNumber)
                .reduce((prev, current) -> current)
                .orElse(BigInteger.ZERO);

        System.out.println("The " + nthFibonacciNumber + "th Fibonacci number is: " + fibonacciNumber);
    }

    static Stream<BigInteger> streamFibonacci() {
        BigInteger[] fibs = new BigInteger[2];
        fibs[0] = BigInteger.ZERO;
        fibs[1] = BigInteger.ONE;
        return Stream.generate(() -> {
            BigInteger result = fibs[1];
            BigInteger fib3 = fibs[0].add(fibs[1]);
            fibs[0] = fibs[1];
            fibs[1] = fib3;
            return result;
        });
    }
}
