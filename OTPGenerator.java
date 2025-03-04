import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {
    public static String generateOTP() {
        return String.format("%06d", new Random().nextInt(900000) + 100000);
    }

    public static boolean areOTPsUnique(String[] otps) {
        return new HashSet<>(Arrays.asList(otps)).size() == otps.length;
    }

    public static void main(String[] args) {
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.println("Are OTPs Unique? " + areOTPsUnique(otps));
    }
}
