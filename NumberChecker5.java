import java.util.Arrays;

public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        return Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static int sumOfDigits(int[] digits) {
        return Arrays.stream(digits).sum();
    }

    public static int sumOfSquares(int[] digits) {
        return Arrays.stream(digits).map(d -> (int) Math.pow(d, 2)).sum();
    }

    public static boolean isHarshad(int num) {
        return num % sumOfDigits(getDigitsArray(num)) == 0;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println("Is Harshad Number? " + isHarshad(num));
    }
}
