import java.util.Scanner;

public class SumNaturalNumbers {
    // Recursive method to find the sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    // Formula method to find the sum of n natural numbers
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Check if n is a natural number
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (greater than 0). Exiting...");
            return;
        }

        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);
        
        // Display results
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);
        
        // Compare results
        if (sumRec == sumForm) {
            System.out.println("Both methods give the same result. Computation is correct!");
        } else {
            System.out.println("Mismatch found! There is an error in the computation.");
        }
    }
}
