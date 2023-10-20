class A {
    public void overred() {
        System.out.println("I am method 1 of class A");
    }
}

class B extends A {
    @Override
    public void overred() {
        System.out.println("I am method 1 of class B");
    }

}

public class method_overriding_02 {
    public static void main(String[] args) {
        A a = new A();
        a.overred();

        B b = new B();
        b.overred();
    }
}
