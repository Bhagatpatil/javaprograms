/*in the program use a try catch method it is use for handle a error
in the program throgh arithmatic error beacuse 900 cannot divede by 0 
 video no : 80
*/
package error;
public class try_catch_01 {
    public static void main(String[] args) {
        int a = 900;
        int b = 0;
        int c;

        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("we failed to divide. reason : ");
            System.out.println(e);
        }
    }
}
