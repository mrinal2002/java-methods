import java.util.Scanner;

public class LineEquation {
    public static double[] findEquation(int x1, int y1, int x2, int y2) {
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        double[] equation = findEquation(x1, y1, x2, y2);
        System.out.println("Equation of Line: y = " + equation[0] + "x + " + equation[1]);
        sc.close();
    }
}
