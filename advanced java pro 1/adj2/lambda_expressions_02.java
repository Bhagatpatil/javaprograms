/*in the program use a lambda expressions and print interface method
 * but it's interface declair only one method like this @functionalInterface
 * and lambda expressions must be @functionalInterface
 * in the program use parameter interface
 **/
package adj2;

@FunctionalInterface
interface math {
    void add(int x, int y);

}

public class lambda_expressions_02 {
    public static void main(String[] args) {
        math m = (x, y) -> {  //method parameter
            System.out.println("Addition is : " + (x + y));
        };
        m.add(6, 5);
    }
}
