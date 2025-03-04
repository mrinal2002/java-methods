import java.util.Scanner;

public class StudentVoteChecker {
    // Check if the student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < studentAges.length; i++) {
            if (canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " (Age " + studentAges[i] + "): Can vote ✅");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + studentAges[i] + "): Cannot vote ❌");
            }
        }

        scanner.close();
    }
}
