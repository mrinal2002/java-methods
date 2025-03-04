import java.util.Scanner;

public class FactorAnalysis {

    // Method to find factors and store them in an array
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        
        return factors;
    }

    // Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }

    // Method to calculate product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }

    // Method to calculate sum of squares of factors
    public static int sumOfSquareOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += Math.pow(factor, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] factors = findFactors(num);
        
        System.out.print("Factors: ");
        for (int factor : factors) System.out.print(factor + " ");
        
        System.out.println("\nSum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Sum of Square of Factors: " + sumOfSquareOfFactors(factors));

        scanner.close();
    }
}
