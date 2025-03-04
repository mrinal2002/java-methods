import java.util.Scanner;

public class QuotientRemainder {
    // Calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int number = scanner.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = scanner.nextInt();
        scanner.close();

        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    }
}
