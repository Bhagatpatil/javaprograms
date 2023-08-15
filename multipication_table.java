import java.util.Scanner;

public class multipication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your multipication table no");
      /*   int n ;
        n=sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i*n);
        }*/

        //it is program are multipication table
        //user any number


        int r ;
        r=sc.nextInt();

        for (int i = 10; i >= 1; i--) {
            System.out.println(i*r);
        }
       // it is program are multipication table are revevse step
       //user any input for number


    }

}
