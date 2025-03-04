import java.util.Scanner;

public class RunningTrack {
    // Calculate rounds needed
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three sides of the park (meters): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        System.out.println("Rounds needed: " + calculateRounds(a, b, c));
    }
}
