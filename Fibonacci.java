import java.util.StringJoiner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 8; // Number of Fibonacci numbers to print
        int first = 0;
        int second = 1;

        System.out.println("First " + n + " Fibonacci numbers:");

        StringJoiner joiner = new StringJoiner(" -> ");

        for (int i = 0; i < n; i++) {
            joiner.add(Integer.toString(first));

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.print(joiner.toString());
    }
}
