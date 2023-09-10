import java.util.Random;
import java.util.Scanner;

class ram {
    public int num;
    public int inputuser;
    public int noofgusses = 0;

    ram() {

        Random rand = new Random();
         num = rand.nextInt(100);

    }

    void input() {
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        inputuser = sc.nextInt();

    }

    boolean isCorrectNumber() {
        noofgusses++;
        if (inputuser == num) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", num, noofgusses);
            return true;

        } else if (inputuser < num) {
            System.out.println("please enter a big number");
        } else if (inputuser > num) {
            System.out.println("please enter a small number");
        }
        return false;
    }

}

public class gameguss {
    public static void main(String[] args) {
        
        ram obj = new ram();
        boolean b = false;
        while (!b) {
            obj.input();
            b = obj.isCorrectNumber();
        }

    }

}
