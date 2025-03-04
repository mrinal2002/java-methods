import java.util.Random;

public class RandomNumberAnalysis {
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Generates 4-digit numbers (1000-9999)
        }
        return numbers;
    }

    // Method to find average, min, and max values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.println("Generated Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[] results = findAverageMinMax(numbers);
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
