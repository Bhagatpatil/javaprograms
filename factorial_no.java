import java.util.Scanner;

public class factorial_no {
    public static void main(String[] args) {
        System.out.println("enter your no");
        Scanner sc = new Scanner(System.in);
        int no;
        no = sc.nextInt();
        int r = 1;
        for (int i = 1; i <= no; i++) {
            r = r * i;

        }
        System.out.println(r);

    }
}
