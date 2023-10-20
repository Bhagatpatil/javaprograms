/*in the program use nested try catch exception handle
 * it is use handle more than error of ine time
 * 82
 */
package error;

import java.util.Scanner;

public class nested_try_catch_02 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {

                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");

                }
            } catch (Exception e) {

            }
        }
        System.out.println("Thanks for using this program");
    }
}
