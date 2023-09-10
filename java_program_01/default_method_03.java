// in the program use default method and private default method call in default method 
// private method can not declair in main method in object

interface MyInterface {
    // Public abstract method
    void someMethod();

    // Default method that uses a private method
    default void anotherMethod() {
        // You can call the private method from here
        helperMethod();
        System.out.println("Called anotherMethod");
    }

    // Private method for use within the interface
    private void helperMethod() {
        System.out.println("Called helperMethod");
    }
}

class MyClass implements MyInterface {
    @Override
    public void someMethod() {
        System.out.println("Implemented someMethod");
    }
}

public class default_method_03{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.someMethod();
        obj.anotherMethod();
    }
}
