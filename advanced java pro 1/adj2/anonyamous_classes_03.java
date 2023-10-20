/* in the program use anonymous classes and print interface method
 * anonymous classes is declair direct main method and referanse and object is interface
 *
 */
package adj2;

interface labarary {
    void granth();

    void book();
}

public class anonyamous_classes_03 {
    public static void main(String[] args) {
        labarary lab = new labarary() {
            @Override
            public void granth() {
                System.out.println("mahabharat");
            }

            @Override
            public void book() {
                System.out.println("logic bilding");
            }
        };
        lab.granth();
        lab.book();
    }
}
