import java.util.Scanner;

public class WindChillCalculator {
    // Calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature (°F): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter Wind Speed (mph): ");
        double windSpeed = scanner.nextDouble();
        scanner.close();

        System.out.println("Wind Chill Temperature: " + calculateWindChill(temperature, windSpeed) + "°F");
    }
}
