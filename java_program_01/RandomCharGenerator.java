import java.util.Random;

public class RandomCharGenerator {
    public static void main(String[] args) {
        char randomChar = generateRandomChar();
        System.out.println("Random Char: " + randomChar);
    }

    public static char generateRandomChar() {
        // Define the range of characters you want to consider
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        // Create a Random object
        Random random = new Random();
        
        // Generate a random index within the range of characters
        int randomIndex = random.nextInt(characters.length());
        
        // Get the random character at the generated index
        char randomChar = characters.charAt(randomIndex);
        
        return randomChar;
    }
}
