import java.util.Random;

public class RandomStringGenerator {
    public static void main(String[] args) {
        int length = 10; // desired length of the random string
        String randomString = generateRandomString(length);
        System.out.println("Random String: " + randomString);
    }

    public static String generateRandomString(int length) {
        // Define the characters that can be included in the random string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        
        // Create a Random object
        Random random = new Random();
        
        // Initialize a StringBuilder to construct the random string
        StringBuilder stringBuilder = new StringBuilder(length);
        
        // Generate random characters and append them to the StringBuilder
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }
        
        // Convert the StringBuilder to a String
        return stringBuilder.toString();
    }
}