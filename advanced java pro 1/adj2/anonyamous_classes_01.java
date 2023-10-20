/* in the program use anonymous classes and print interface method
 * anonymous classes is declair direct main method and referanse and object is interface
 *
 */

package adj2;

interface xuv {
    void model();

    void colour();
}

/*class car implements xuv{

    @Override
    public void model() {
        System.out.println("nexon");
    }

    @Override
    public void colour() {
        System.out.println("white");
    }
}*/
public class anonyamous_classes_01 {
    public static void main(String[] args) {
        //first way use class and print interface method
        /*car n = new car();
        n.model();
        n.colour();
        */

        //second way use anonymous classes
        xuv n = new xuv() {
            @Override
            public void model() {
                System.out.println("Thar");
            }

            @Override
            public void colour() {
                System.out.println("black");
            }
        };
        n.model();
        n.colour();

    }
}
