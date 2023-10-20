/*in the program is use a class extends Exception
 * it is use by costum exception use of try catch block
 * 83 
 */
package error;

import java.util.Scanner;

class myexception extends Exception {
    @Override
    public String toString() {
        return "i am tostring ";
    }

    @Override
    public String getMessage() {
        return "i am getmassage";
    }
}

public class exception_class_01 {
    public static void main(String[] args) {
        int a;
        System.out.println("enter your value of a");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 20) {
            try {
                throw new myexception();

            } catch (Exception e) {

                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // System.out.println(e); // when sout dairect e then method call is toString
                e.printStackTrace();// it is no error its help by find a error line

            }
            System.out.println("finished");

        }

    }
}
