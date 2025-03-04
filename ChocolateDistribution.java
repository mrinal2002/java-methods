import java.util.Scanner;

public class ChocolateDistribution {
    // Distribute chocolates and find remaining
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        return new int[]{numberOfChocolates / numberOfChildren, numberOfChocolates % numberOfChildren};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();
        scanner.close();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates, Remaining chocolates: " + result[1]);
    }
}
