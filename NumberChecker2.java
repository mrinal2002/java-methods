import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberChecker2 {
    // Method to count the number of digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits of the number in an array
    public static int[] getDigits(int num) {
        return Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int num) {
        return Arrays.stream(getDigits(num)).sum();
    }

    // Method to find the sum of squares of the digits
    public static int sumOfSquaresOfDigits(int num) {
        return Arrays.stream(getDigits(num)).map(d -> (int) Math.pow(d, 2)).sum();
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int num) {
        return num % sumOfDigits(num) == 0;
    }

    // Method to find the frequency of each digit in the number
    public static Map<Integer, Integer> digitFrequency(int num) {
        int[] digits = getDigits(num);
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int d : digits) {
            frequencyMap.put(d, frequencyMap.getOrDefault(d, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        int number = 21;

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digits: " + Arrays.toString(getDigits(number)));
        System.out.println("Sum of Digits: " + sumOfDigits(number));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Is Harshad Number? " + isHarshad(number));

        System.out.println("Digit Frequencies: " + digitFrequency(number));
    }
}
