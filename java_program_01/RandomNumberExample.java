import java.util.Random;

public class RandomNumberExample {
    public static void main(String[] args) {
       
        Random random = new Random();   // Create a Random object

        // Generate random integers

        int randomNumber2 = random.nextInt(100); // Generates a random integer between 0 (inclusive) and 100 (exclusive)

        System.out.println("Random Number 2: " + randomNumber2);
    }
}