
/*in the program  use a method overrding */

/*
Method overriding in Java refers to the ability of a subclass to provide 
a specific implementation for a method that is already defined in its superclass. 
When a subclass defines a method with the same name, return type, and 
parameter list as a method in its superclass, it is said to be overriding that method.
The overridden method in the subclass must have the
same method signature (method name, return type, and parameter types) 
as the method in the superclass.
*/

class A {
    public void mate1() {
        System.out.println("i am  class A mate1");
    }

    public void mate2() {
        System.out.println("i am class A mate2");
    }

}

class B extends A {
    @Override     // in the program @Override is optional . is decliar or no declair not issue our output
    public void mate2() {

        System.out.println("i am class B mate2 ");
    }

    public void mate1() {
        System.out.println("i am class B mate1");
    }

}

public class method_overriding_01 {
    public static void main(String[] args) {

        A obj1 = new A();
        obj1.mate2();

        B obj2 = new B();
        obj2.mate2();

        A obj3 = new A();
        obj3.mate1();

        B obj4 = new B();
        obj4.mate1();

    }

}
