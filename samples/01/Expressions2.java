public class Expressions2 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 6;
        System.out.println(num1 + num2);
        System.out.println(num1 / num2);
        System.out.println(num1 / (double) num2);
        System.out.println(num1 == num2);
        System.out.println(
                (num1 | num2) + ": (" + Integer.toBinaryString(num1) + " | " + Integer.toBinaryString(num2) + ") = "
                        + Integer.toBinaryString(num1 | num2));

    }

}
