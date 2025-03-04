import java.util.Random;

public class FootballTeamHeightAnalysis {

    // Method to find the sum of all heights
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) sum += height;
        return sum;
    }

    // Method to find the mean height
    public static double meanHeight(int[] heights) {
        return (double) sumOfHeights(heights) / heights.length;
    }

    // Method to find the shortest player
    public static int shortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) shortest = height;
        }
        return shortest;
    }

    // Method to find the tallest player
    public static int tallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) tallest = height;
        }
        return tallest;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11];

        // Generating random heights between 150 cm and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
        }

        // Displaying the heights
        System.out.print("Player Heights: ");
        for (int height : heights) System.out.print(height + " ");
        
        System.out.println("\nShortest Height: " + shortestHeight(heights) + " cm");
        System.out.println("Tallest Height: " + tallestHeight(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm%n", meanHeight(heights));
    }
}
