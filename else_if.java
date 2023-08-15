import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        System.out.println("entre your age");
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        if (age > 80){
            System.out.println(" you are no");
        }

        else if(age > 50 ) {
            System.out.println("you are experience");
        }
        
        
        else if (age > 40) {
            System.out.println("you are semi experience");
        } else if (age > 30) {
            System.out.println("you are semi-semi experience");
        } 
         else {
            System.out.println("you are not required");

            /*
             * in the program use a else if it is use for
             * more than 2 condition for any user
             */

        }
    }

}
