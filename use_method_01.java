public class use_method_01 {

    // in the program use method and force the [changing the integer for (x)]
    // but no change this value
    // in the class before static public is optional 
  /* public*/ static void change(int a) {
        a = 67;

    }

    public static void main(String[] args) {
        int[] marks = { 56, 65, 54, 45, 36, 56, 75 };
        int x = 56;
        change(x);
        System.out.println(x);

    }

}
