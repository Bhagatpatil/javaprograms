/*in the program use a interface  and super class ,subclass,constructor,
super ,extends,implement keyword 
in the interface declair property and method is final it is no modify and
any changes (not) possible*/

interface bycycle { // use interface
    int n = 12; // declair property it is no modify below program

    void applybreak();

    void speedup();

}

interface blowhorn { // use interface

    void horn();

}

class ram { // use super class

    ram(String a) { // use super class constructor
        System.out.println("I am driver of truck : " + a);
    }

    ram(long m) {// use super class constructor
        System.out.println("driver mobile number : " + m);
    }

}

class truck extends ram implements bycycle, blowhorn { // use subclass and extends super class and implement interface

    truck(String a) { // use super keyword and subclass constructor and call super class contructor
        super(a);
    }

    truck(long m) { // use super keyword and call super class costructor
        super(m);
    }

    @Override
    public void applybreak() { // use interface method
        System.out.println("stop the truck");
    }

    @Override
    public void speedup() {// use interface method
        System.out.println("runing truck");
    }

    @Override
    public void horn() {// use interface method
        System.out.println("pee pee pee.....");
    }

}

public class intreface_01 {
    public static void main(String[] args) {
        truck my = new truck("ram patil"); // use referance and object of subclass argument constructor
        truck mo = new truck(9730365780l); // use referance and object of subclass argument constructor
        System.out.println("tyre of truck : " + my.n);// call property of interface bycycle
        my.applybreak();// call method
        my.speedup();// call method
        my.horn();// call method

    }

}
