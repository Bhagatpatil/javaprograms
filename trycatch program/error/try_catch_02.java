/*in the program use a try catch method it is use for handle error 
 * this  program  throgh error when user input is wrong (input is out of index of array)
 *  then work for try catch method and handle a error
 * 80
 */
package error;

import java.util.*;

public class try_catch_02 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        Scanner sc = new Scanner(System.in);
        int arrindex;
        int divnum;
        System.out.println("enter index of array");
        arrindex = sc.nextInt();
        System.out.println("enter number of divide index");
        divnum = sc.nextInt();

        try {
            System.out.println("value of index in array : " + arr[arrindex]);
            System.out.println("divide by " + divnum + " of value : " + arr[arrindex] / divnum);

        } catch (Exception e) {
            System.out.println("\n eoor :- your enter index is out of array index 9");
            System.out.println(e);
        }

    }
}
