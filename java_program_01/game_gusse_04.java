import java.util.*;
import java.util.Random;

class g {
    public int a;
    public int b;
    public int c = 0;

    g() {
        Random rand = new Random();
        a = rand.nextInt(50);
        // System.out.println(a);

    }

    public void takeuser() {
        System.out.println("enter your gusse");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();

    }

    boolean output() {
        c++;
        if (a == b) {
            System.out.println("congratulation right gusse : " + a);
            System.out.println("your game attems : " + c);
            return true;
        } else if (a < b) {
            System.out.println("reduse your gusse");
        } else if (a > b) {
            System.out.println("increse your gusse");
        }
        return false;

    }
}

public class game_gusse_04 {
    public static void main(String[] args) {
        g GM = new g();

        boolean d = false;
        while (!d) {
            GM.takeuser();
            d = GM.output();
        }

    }

}
