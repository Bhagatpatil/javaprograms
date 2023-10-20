import java.util.Scanner;

public class hellouser {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("what is your name");
        String name;
        name = Sc.next();

        System.out.println(("Hello  ") + name + ("  have a good day"));

    }

}
