
/* in the class declair how to use constructor in inheritance
    in the program use a default constuctor and argument constructor  

 */

class mobile {

    mobile() {
        System.out.println("NOKIA");
    }

    mobile(String x) {
        System.out.println(x);
    }
}

class smartphone extends mobile {

    smartphone() {
        super();   // only super keyword is optional 
        System.out.println("sumsung");
    }

    smartphone(String y) {
        super("realme");     // but super with argumet is not optinal 
        System.out.println(y);
    }
}

public class inhertance_in_constructor_01 {
    public static void main(String[] args) {
       // smartphone obj = new smartphone(); 
        System.out.println("abow output is defult contructor\n");
        System.out.println("bello output is contructor overloding ");
        smartphone obj1 = new smartphone("APPLE");

    }
}
