/*in the program use finnaly block */
package error;
public class finnaly_block_03 {

    public static void main(String[] args) {

        int a = 7;
        int b = 5;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println("can not divide by 0");
                System.out.println(e);
                
                break;
            } finally {
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }


    }
}
