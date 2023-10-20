
// in the program use for class and object and method 
// this program no declair a, b value but output is 0 and null
// integer intilize value are 0, and String intilize value are null 

class A {
    int a;
    String b;

    void show() {
        System.out.println(a + "   \n" + b);

    }
}

public class my_demo01 {
    public static void main(String[] args) {

        A obj = new A();

        obj.show();

    }
}
