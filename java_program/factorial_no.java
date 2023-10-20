/* multiplication of all positive integers smaller than or equal to n. 
For example factorial of 6 is 6*5*4*3*2*1 which is 720.  */

import java.util.*;

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
