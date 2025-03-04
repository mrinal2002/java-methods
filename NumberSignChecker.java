import java.util.Scanner;

public class NumberSignChecker {
    // Check number sign
    public static int checkSign(int num) {
        return Integer.compare(num, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int result = checkSign(num);
        System.out.println(num + " is " + (result == 1 ? "Positive" : result == -1 ? "Negative" : "Zero"));
    }
}
