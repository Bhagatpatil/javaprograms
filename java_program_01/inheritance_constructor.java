
/*in the program use a constructor in inheritance */

class c1 {
    c1() {
        System.out.println("I am c1 class constructor");

    }

    c1(int a) {
        System.out.println("  I am c1 class overloded constructor : " + a);
    }
}

class c2 extends c1 {
    c2() {
        System.out.println("I am c2 class constructor");
    }

    c2(int a, int b) {
        super(a);
        System.out.println("  I am c2 class overloded constructor : " + b);
    }
}

class c3 extends c2 {
    c3() {
        System.out.println("I am c3 class constructor");
    }

    c3(int a, int b, int c) {
        super(a, b);
        System.out.println("  I am c3 class overloded constructor : " + c);
    }
}

public class inheritance_constructor {
    public static void main(String[] args) {
        c3 obj = new c3();                   // it is difault constructor
        c3 obj1 = new c3(11, 21, 31);  // it is argumented constructor
       
        

    }
}
