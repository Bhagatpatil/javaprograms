/*in the program use a try catch method it is use for handle error 
 * this  program  throgh error when user input is wrong (input is out of index of array)
 *  then work for try catch method and handle a error
 * 80
 */
package error;

import java.util.Scanner;;

public class try_catch_03 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 50;
        arr[1] = 60;
        arr[2] = 70;
        arr[3] = 80;
        arr[4] = 90;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your index of array");
        int indexno;
        indexno = sc.nextInt();
        System.out.println("enter no of divide by array value");
        int divno;
        divno = sc.nextInt();

        try {
            System.out.println("your enter index value : " + arr[indexno]);
            System.out.println("divide of " + divno + " value : " + arr[indexno] / divno);
        } catch (Exception e) {
            System.out.println("we failed run resoin : ");
            System.out.println(e);
        }

    }
}
