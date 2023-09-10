import java.util.Scanner;
import java.util.Random;

class game3 {
    public int a;
    public int b;
    public int c;
    

    game3() {
        Random rand = new Random();
        a = rand.nextInt(50);
       
        
    }

    void tekeinput() {
        System.out.println("enter your gusse number");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
    }

    boolean iswrite() {
        c++;
        if (a == b) {
            System.out.println("  congratulation  your gusse great : " + a);
            System.out.println("  your attempt : " + c);
            return true;
        } else if (a < b) {
            System.out.println("please reduse your thinking capacity");
        } else if (a > b) {
            System.out.println("please increase your thinking capacity");
        }
        return false;

    }
}

public class gamegusse3 {
    public static void main(String[] args) {
        game3 obj = new game3();
        boolean b = false;
        while (!b) {
            obj.tekeinput();
            b = obj.iswrite();
        }
    }

}
