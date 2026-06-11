import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digits    = "0123456789";
        String special   = "!@#$%^&*()-_=+[]{}|;:',.<>?/";
        String allChars  = uppercase + lowercase + digits + special;

        Random random = new Random();
        char[] password = new char[15];

        // Guarantee at least one from each category
        password[0] = uppercase.charAt(random.nextInt(uppercase.length()));
        password[1] = lowercase.charAt(random.nextInt(lowercase.length()));
        password[2] = digits.charAt(random.nextInt(digits.length()));
        password[3] = special.charAt(random.nextInt(special.length()));

        // Fill the rest randomly
        for (int i = 4; i < 15; i++) {
            password[i] = allChars.charAt(random.nextInt(allChars.length()));
        }

        // Shuffle so guaranteed chars aren't always first
        for (int i = 14; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }

        System.out.println("Generated Password: " + new String(password));
    }
}