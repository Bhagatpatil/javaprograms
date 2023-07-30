import java.util.Scanner;

public class while_loop {

    public static void main(String[] args) {
        System.out.println("entar your number");
        Scanner sc = new Scanner(System.in);
        int a;
        
        a = sc.nextInt();
        while (a <50) {
            System.out.println(a);
            a++;
        }
        System.out.println(a);
    }

}
