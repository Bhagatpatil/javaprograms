/* in the program use finnaly block 
 * 85 
*/
package error;

public class finnaly_block_01 {
    public static int div() {
        try {
            int a = 100;
            int b = 0;// b value is 0 then run a exception block 
            // int b=5 // b value is any natural number then run try block
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("\nI am fanally");
        }
        return -1;

    }

    public static void main(String[] args) {
        int d = div();
        System.out.println(d);

    }
}
