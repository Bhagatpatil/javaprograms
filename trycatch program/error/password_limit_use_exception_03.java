
/*in the program use try catch block and print limit of password 
like this ATM password limit 
with use boolean flag 
 */
package error;

import java.util.Scanner;

public class password_limit_use_exception_03 {
    public static void main(String[] args) {
        int[] arr = { 45, 56, 78, 98, 45, 12, 32, 85 };
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int i = 0;

        while (flag && i < 5) {
            try {
                System.out.println("enter valid index");
                int ind = sc.nextInt();
                System.out.println("enter index value is " + arr[ind]);
                flag = false;

            } catch (Exception e) {
                System.out.println("invalid index");
                i++;
            }
        }

        if (i >= 5) {

            System.out.println("error.........");
        }
    }
}
