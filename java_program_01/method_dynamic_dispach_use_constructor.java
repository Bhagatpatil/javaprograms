/*in the program use a method dispatch and constructor in inheritance
 *  when we creating object, refernce is super class and object is sub class 
 * is called  dynamic method dispatch
 * in program super class is c1 and sub class is c2 ,c3
 */

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


public class method_dynamic_dispach_use_constructor {
    public static void main(String[] args) {
      
        c1 obj = new c3();    // it is dynamic method dispatch  
        c1 obj1 = new c3(11, 21, 31); // it is constructor argument dynamic method dispatch
     
        
    }
    
}
