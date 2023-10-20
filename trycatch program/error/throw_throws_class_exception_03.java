/*in the program use throw ,throws and user create exception (like this negativeRadiusException)
 * and in program use finally block
 * and use try catch and handle the error exception
 * video no : 84
*/
package error;

class nigetiveradius extends Exception {

    public String toString() {
        return "your entered radius is nigtive redius";
    }
}

public class throw_throws_class_exception_03 {

    public static double area(int r) throws nigetiveradius {
        if (r < 0) {
            throw new nigetiveradius();
        }

        return Math.PI * r * r;

    }

    public static int div(int x, int y) {
        int result;
        return result = x / y;

    }

    public static void main(String[] args) {

        try {
            int c = div(10, 5);
            System.out.println(c);
            double ar = area(3);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println(" exception");
            System.out.println(e);
            e.printStackTrace();

        }

    }
}
