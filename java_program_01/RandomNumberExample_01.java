import java.util.Random;

public class RandomNumberExample_01 {

     public static void main(String[] args) {
        Random random = new Random();
        float randomNumber = random.nextFloat(100);
        System.out.println(randomNumber);

        int randomNumber1 = random.nextInt(100);
        System.out.println(randomNumber1);

    }

}
