/*in the program use nterface and extends class 
in the use polymorphism in interface
in the referance of interface animal and object is human
alllowod
 */

class monky {
    public void jump() {
        System.out.println("jumping..");
    }

    void bite() {
        System.out.println("biteing..");

    }
}

interface animal {
    void eat();

    void sleep();
}

class human extends monky implements animal {

    public void speak() {
        System.out.println("good morning");
    }

    public void eat() {
        System.out.println("eating..");
    }

    public void sleep() {
        System.out.println("sleeping..");
    }

}

public class abstract_class_06 {
    public static void main(String[] args) {
        human man = new human();
        man.bite();
        man.jump();
        man.speak();
        man.eat();
        man.sleep();

        monky m = new human(); // polymorphisam
        m.jump();
        m.bite();
        // m.speak(); // not allowod
        // m.eat(); //not allowod
        // m.sleep(); // not allowod

        animal dog = new human();
        // referance of interface animal and object is human

        dog.eat();
        dog.sleep();
        // dog.speak(); // not allowod
        // dog.bite();//not allowod
        // dog.jump();//not allowod

    }
}
