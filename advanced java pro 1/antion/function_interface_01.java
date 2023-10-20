/*in the program use function interface
 * in the function interface only one method declair
 * in no one more method declair
 * in the program can use method dispyach
 *
 */
package antion;

@FunctionalInterface
interface myFunctionalInterface {
    void math1();

}

class function implements myFunctionalInterface {
    @Override
    public void math1() {
        System.out.println("I am @FunctionalInterface");
    }
}

public class function_interface_01 {
    public static void main(String[] args) {
        function f = new function(); //use class refrence
        f.math1();

        myFunctionalInterface m = new function();//use interface refrence method dispyach
        m.math1();


    }
}
