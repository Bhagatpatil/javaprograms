/*in the program use a throws keyword it is declair Exception 
 * 
 */
package error;

import java.util.Scanner;

public class throw_throws_01 {

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int a = sc.nextInt();
        System.out.println("enter b value");
        int b = sc.nextInt();
        try {
            int c = divide(a, b);
            System.out.println(" \n" + c);
        } catch (Exception e) {
            System.out.println("can not divide by 0");
            System.out.println(e);

        } finally {
            System.out.println("i am finnally block");
        }

    }
}
