/*in the program use abstract class and abstract method
 * in java can referance is abstract class and objet as subclass 
  when referance is abstract class ans object is subclass then no call not abstract method 
  in main method
 */

abstract class phone {

    abstract public void call();

    abstract public void music();
}

class mobile extends phone {
    @Override
    public void call() {
        System.out.println("calling.....");
    }

    @Override
    public void music() {
        System.out.println("play music \n");
    }

    public void time() {
        System.out.println("corrunt time 19:16");
    }
}

public class abstract_class_03 {
    public static void main(String[] args) {
        phone vivo = new mobile(); // referance abstract class object subclass.
        vivo.call();
        vivo.music();
        // vivo.time(); // not allowed

        mobile oppo = new mobile(); // referance sublass and object subclass
        vivo.call();
        vivo.music();
        oppo.time();

    }

}
