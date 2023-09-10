class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
   
    void makeSound() {
        
        System.out.println("Dog barks");
    }
}

/*class Cat extends dog{
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
} */

public class Main {
    public static void main(String[] args) {
        Dog obj=new Dog();
        Animal obj1=new Animal();
        obj.makeSound();       
        obj1.makeSound();
    }
}








/* Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();  // Output will be "Dog barks"
        animal2.makeSound();  // Output will be "Cat meows"
        */