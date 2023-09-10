import java.util.Scanner;
import java.util.Random;

class gm1 {
    public int a;
    public int b;
    public int c = 0;

    public gm1() {
        Random rand = new Random();
        a = rand.nextInt(50);
        // System.out.println(a);

    }

    public void user() {
        System.out.println("enter your think number ");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
    }

    boolean useris() {
        c++;
        if (a == b) {
            System.out.println("correct gusse : " + a);
            System.out.println("your game attemt : " + c);
            return true;
        } else if (a < b) {
            System.out.println("please reduse your think");
        } else if (a > b) {
            System.out.println("please increse your think");
        }
        return false;

    }
}

public class game_gusse_3 {
    public static void main(String[] args) {
        gm1 obj1 = new gm1();
        boolean b = false;
        while (!b) {
            obj1.user();
            b = obj1.useris();

        }
    }

}
