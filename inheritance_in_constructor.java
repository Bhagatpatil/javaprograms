
class base {

    base() {
        System.out.println("\ni am base class constructor");
    }

    base(int x) {
        System.out.println("\ni am overloded constructor of base class : " + x);
    }
}

class derived extends base {

    derived() {
        System.out.println("i am a derived class contructor");
    }

    derived(int x, int y) {
        super(x);
        System.out.println("i am overloded constuctor of derived class : " + y);
    }
}

class derivedchild extends derived{

    derivedchild() {
        System.out.println("i am a derivedchild class constructor \n");
    }

    derivedchild(int x, int y, int z) {
        super(x,y);
        System.out.println("i am overloded constructor of derivedchild class : " + z + "\n");
    }
}

public class inheritance_in_constructor {
    public static void main(String[] args) {
        
        derivedchild obj=new derivedchild();
        derivedchild obj1 = new derivedchild(11, 21, 31);

    }

}
