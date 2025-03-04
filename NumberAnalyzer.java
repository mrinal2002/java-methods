import java.util.Scanner;

public class NumberAnalyzer {
    // Check if a number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Compare two numbers
    public static int compare(int num1, int num2) {
        return Integer.compare(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println(num + " is Negative.");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of first and last elements: ");
        if (result > 0) {
            System.out.println("First number is greater than last number.");
        } else if (result < 0) {
            System.out.println("First number is less than last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }

        scanner.close();
    }
}
