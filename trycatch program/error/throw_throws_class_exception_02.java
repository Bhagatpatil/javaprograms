/*in the program use throw ,throws and user create exception (like this negativeRadiusException)
 * and in program use finally block
 * and use try catch and handle the error exception
 * video no : 84
*/
package error;

import java.util.Scanner;

class negativeRadiusException extends Exception {

    public String toString() {
        return "negative radius is not allowed";

    }

    public String getMessage() {
        return " negative radius is not allowed";
    }

}

public class throw_throws_class_exception_02 {

    public static double area(int r) throws negativeRadiusException {
        // negativeRadiusException is user create exception

        if (r < 0) {
            throw new negativeRadiusException();
        }

        double result = Math.PI * r * r;
        return result;

    }

    public static int divide(int x, int y) throws ArithmeticException {
        // ArithmeticException is in bield exception in java
        return x / y;
    }

    public static void main(String[] args) {

        try {
            int c = divide(30, 5);// call divide method
            System.out.println("divided by value : " + c);// print divide method
            double ar = area(3);// call area method
            System.out.println("\narea is : " + ar);// print area method
        } catch (Exception e) {
            System.out.println("can not divide by 0");// devide method exceptin
            System.out.println(e);// area method exception e print the tostring method
            // System.out.println(e.getMessage()); //it is no need but only call

        } finally {

            System.out.println("\ni am finnally block");
            System.out.println(10 * 12);
        }

    }
}
