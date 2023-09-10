/* in the program use abstract class and abstract method 
   in java can not make object from abstract class i
   abstract class it is standara class */

abstract class Parent2{
    public Parent2(){
        System.out.println("Mai parent2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}


public class abstract_class_01 {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); -- error

        c.greet();
        c.greet2();
        
    }
}