import java.util.Random;

public class FootballTeam {
    // Method to generate random heights between 150 and 250 cm
    public static int[] generateRandomHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // Generates heights between 150 and 250 cm
        }
        return heights;
    }

    // Method to find the sum of all elements in an array
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);

        System.out.println("Heights of players:");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm\n", findMean(heights));
    }
}
