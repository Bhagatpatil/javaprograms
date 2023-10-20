/*in the program use a lambda expressions and print interface method
 * but it's interface declair only one method like this @functionalInterface
 * and lambda expressions must be @functionalInterface
 * in the program use parameter interface
 **/

package adj2;

@FunctionalInterface
interface year {
    void curentyear();
}

public class lambda_expressions_04 {
    public static void main(String[] args) {
        year Y = () -> {
            System.out.println("2023");
        };
        Y.curentyear();
    }
}
