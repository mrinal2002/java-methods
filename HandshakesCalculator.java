import java.util.Scanner;

public class HandshakesCalculator {
    // Calculate maximum handshakes
    public static int maxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();
        scanner.close();

        System.out.println("Maximum handshakes: " + maxHandshakes(students));
    }
}
