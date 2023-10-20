import java.util.Scanner;

public class use_method_multipication_table {

    static void mul(int n) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(n * i);

        }

    }

    public static void main(String[] args) {
        System.out.println("enter your number ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        mul(n);

    }

}
