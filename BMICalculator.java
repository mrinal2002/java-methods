import java.util.Scanner;

public class BMICalculator {
    // Calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // Convert height to meters
        return weight / (heightM * heightM);
    }

    // Determine BMI Status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] people = new double[10][3]; // [weight, height, BMI]

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            people[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            people[i][1] = scanner.nextDouble();
            people[i][2] = calculateBMI(people[i][0], people[i][1]);
        }

        System.out.println("\nBMI Results:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Weight: %.2f kg, Height: %.2f cm, BMI: %.2f (%s)\n",
                    i + 1, people[i][0], people[i][1], people[i][2], getBMIStatus(people[i][2]));
        }

        scanner.close();
    }
}
