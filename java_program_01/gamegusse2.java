import java.util.Scanner;
import java.util.Random;

class laptop {
    public int num;
    public int a;
    public int noofgusse;

    laptop() {
        Random rand = new Random();
        num = rand.nextInt(100);

    }

    void inputuser() {
        System.out.println("enter your gusse number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

    }

    boolean gusse() {
        noofgusse++;
        if (a == num) {
            System.out.println("yes you are correct no : " + num);
            System.out.println("gesseed attemt : " + noofgusse);
            return true;
        } else if (a < num) {
            System.out.println("please enter big no");

        } else if (a > num) {
            System.out.println("please enter small no");

        }
        return false;
    }

}

public class gamegusse2 {
    public static void main(String[] args) {
        laptop obj = new laptop();

        boolean b = false;
        while (!b) {
            obj.inputuser();
            b = obj.gusse();
        }

    }

}
