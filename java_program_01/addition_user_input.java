//type of package use 

/*in the program use a Scanner packge and print user input addition 
 * in the program method of syntax of imort Scanner is change
 * import Scanner write a two type 
 */

// import java.util.Scanner; // type : 1
import java.util.*; //type : 2

public class addition_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");
        int a = sc.nextInt();
        System.out.println("enter your second number");
        int b = sc.nextInt();
        int c;
        System.out.println("addition is : " + (c = a + b));
    }

}
