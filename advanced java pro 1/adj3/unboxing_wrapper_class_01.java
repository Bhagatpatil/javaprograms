/*in the program use a wrapper class
 * This wrapper class type is unboxing wrapper class
 * it is use for convert object to primitive data type
 * */
package adj3;

public class unboxing_wrapper_class_01 {
    public static void main(String[] args) {
        Integer ob = new Integer(10);//it is object //it's not a error
        int i = ob;//it is convert object to primitive data type (unboxing)
        System.out.println(i);//print primitive data type
    }
}
