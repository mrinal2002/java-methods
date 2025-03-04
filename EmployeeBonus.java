import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] employees = new int[10][2];
        double[][] newSalaries = new double[10][2];

        for (int i = 0; i < 10; i++) {
            employees[i][0] = rand.nextInt(90000) + 10000; // Random salary between 10,000 and 100,000
            employees[i][1] = rand.nextInt(10) + 1; // Random years of service between 1 and 10
        }

        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("ID | Old Salary | Years | Bonus  | New Salary");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < 10; i++) {
            double bonus = (employees[i][1] > 5) ? 0.05 * employees[i][0] : 0.02 * employees[i][0];
            double newSalary = employees[i][0] + bonus;
            newSalaries[i][0] = newSalary;
            newSalaries[i][1] = bonus;

            totalOldSalary += employees[i][0];
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%2d | %9d | %5d | %6.2f | %10.2f%n", (i + 1), employees[i][0], employees[i][1], bonus, newSalary);
        }

        System.out.println("--------------------------------------------");
        System.out.printf("Total: %10.2f |        | %6.2f | %10.2f%n", totalOldSalary, totalBonus, totalNewSalary);
    }
}
