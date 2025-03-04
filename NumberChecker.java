import java.util.ArrayList;
import java.util.List;

public class NumberChecker {
    // Method to count the number of digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits of the number in an array
    public static int[] getDigits(int num) {
        List<Integer> digitList = new ArrayList<>();
        while (num > 0) {
            digitList.add(0, num % 10);
            num /= 10;
        }
        return digitList.stream().mapToInt(i -> i).toArray();
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int sum = 0;
        int power = digits.length;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    // Method to find the largest and second-largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second-smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // Change this to test other numbers

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));

        int[] digits = getDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number? " + (isDuckNumber(number) ? "Yes" : "No"));
        System.out.println("Is Armstrong Number? " + (isArmstrong(number) ? "Yes" : "No"));

        int[] largestNumbers = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestNumbers[0]);
        System.out.println("Second Largest Digit: " + largestNumbers[1]);

        int[] smallestNumbers = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestNumbers[0]);
        System.out.println("Second Smallest Digit: " + smallestNumbers[1]);
    }
}
