/*in the program use arraylist and print array for add method
 * it's code define when arralist have not generics then print any type data add 
 * in array
 * like this String ,int ,float,long  etc...
 */
import java.util.ArrayList;

public class arraylist_01 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList<>();

        array.add(31);
        array.add("ram");
        array.add(21);
        array.add(2.5f);
        array.add(2.0158);

        System.out.println(array);
    }

}
