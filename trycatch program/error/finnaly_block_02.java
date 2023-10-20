/*in the program use fanally program */
package error;

class final1 {

    int[] arr = { 3, 4, 5, 6, 7, 8, 9 };

    public int ar() {
        try {
            for (int e : arr) {
                System.out.println(e);
                if (e == 6) {
                    break;

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("i am fanally");
        }
        return -1;

    }
}

public class finnaly_block_02 {
    public static void main(String[] args) {
        final1 obj = new final1();
        obj.ar();

    }
}
