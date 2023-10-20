/*in the program use function interface
 * in the function interface only one method declair
 * in no one more method declair
 * in the program can use method dispyach
 *
 */

package antion;

@FunctionalInterface
interface functioninterface {
    int sum(int x, int y);

}

class add implements functioninterface {
    public int sum(int x, int y) {
        System.out.println(x + y);
        return 0;
    }
}

public class function_interface_02 {
    public static void main(String[] args) {
        add a = new add();
        a.sum(1, 10);
    }
}
