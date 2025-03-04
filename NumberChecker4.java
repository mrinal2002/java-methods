public class NumberChecker4 {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        return sumOfDigits(square) == num;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int num) {
        int[] digits = getDigits(num);
        int sum = sumOfDigits(num);
        int product = Arrays.stream(digits).reduce(1, (a, b) -> a * b);
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int num) {
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(num * num);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 25; // Change for testing

        System.out.println("Number: " + number);
        System.out.println("Is Prime? " + isPrime(number));
        System.out.println("Is Neon Number? " + isNeon(number));
        System.out.println("Is Spy Number? " + isSpy(number));
        System.out.println("Is Automorphic Number? " + isAutomorphic(number));
        System.out.println("Is Buzz Number? " + isBuzz(number));
    }
}
