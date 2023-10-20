
import java.util.Scanner;

public class marksheet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int physics = sc.nextInt();
        System.out.println("Enter your English marks : ");
        int English = sc.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int chemistry = sc.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int mathematics = sc.nextInt();
        System.out.println("Enter your Computer Science marks : ");
        Float computer = sc.nextFloat();

        float percentage = ((physics + English + chemistry + mathematics + computer) / 500.0f) * 100;

        System.out.println("percentage : ");
        System.out.println(percentage);

    }
}
