/*in the program use try catch block and print limit of password 
like this ATM password limit  
use break keyword
*/

package error;

import java.util.Scanner;

public class password_limit_use_exception_01 {
    public static void main(String[] args) {
        int[] arr = { 23, 43, 56, 76, 54, 23 };

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int index;
        while (i < 5) {
            try {
                System.out.println("enter valid index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is : " + arr[index]);
                break;
            } catch (Exception e) {
                System.out.println("invalid index");
                i++;
            }

        }
        if (i >= 5) {
            System.out.println("error........");
        }
    }
}
