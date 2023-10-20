/* in the program use anonymous classes and print interface method
 * anonymous classes is declair direct main method and referanse and object is interface
 *
 */
package adj2;

interface nokia {
    void call();

    void alarm();

}

public class anonyamous_classes_02 {
    public static void main(String[] args) {
        nokia phone = new nokia() {
            @Override
            public void call() {
                System.out.println("calling.....");
            }

            @Override
            public void alarm() {
                System.out.println("Good Morning....");
            }
        };
        phone.call();
        phone.alarm();

    }
}
