/*in the program use a lambda expressions and print interface method
 * but it's interface declair only one method like this @functionalInterface
 * and lambda expressions must be @functionalInterface
 **/
package adj2;

@FunctionalInterface
interface mobile {
    void realme();
}

public class lambda_expressions_03 {
    public static void main(String[] args) {
        mobile phone = () -> {
            System.out.println("\n ** realme 3 pro is smartphone ** \n");
        };
        phone.realme();
    }
}
