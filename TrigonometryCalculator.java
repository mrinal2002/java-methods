import java.util.Scanner;

public class TrigonometryCalculator {
    // Calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        scanner.close();

        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + results[0] + ", Cosine: " + results[1] + ", Tangent: " + results[2]);
    }
}
