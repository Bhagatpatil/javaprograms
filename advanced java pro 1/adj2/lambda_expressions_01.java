/*in the program use a lambda expressions and print interface method
 * but it's interface declair only one method like this @functionalInterface
 * and lambda expressions must be @functionalInterface
 **/
package adj2;

@FunctionalInterface
interface college {
    void deogiri();

}

public class lambda_expressions_01 {
    public static void main(String[] args) {
        college obj = () -> {
            System.out.println("\n** deogiri college is best and very diciplain **\n");
        };
        obj.deogiri();
    }
}
