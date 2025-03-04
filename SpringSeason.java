import java.util.Scanner;

public class SpringSeason {
    // Check if the given month and day are in the spring season
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter Day (1-31): ");
        int day = scanner.nextInt();
        scanner.close();

        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
