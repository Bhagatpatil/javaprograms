/* in the program use inheritance in interface
 * 
 */
interface book {// interface
    void reachdad();

    void thinkandgroth();
}

interface granth {// interface
    void mahabharat();

    void ramayan();
}

interface notes extends book, granth { // interface extends in interface book and granth

    void java();

    void cpp();

}

class reading implements notes { // implements in class of interface notes

    public void reachdad() {
        System.out.println("\nthis book is in first row second column");
    }

    public void thinkandgroth() {
        System.out.println("this book is in first row thread column\n");

    }

    public void mahabharat() {
        System.out.println("this granth is in first column first row");

    }

    public void ramayan() {
        System.out.println("this granth is in second column thread  row\n ");

    }

    public void java() {
        System.out.println("this notes is in first row second column");

    }

    public void cpp() {
        System.out.println("this notes is in four colomn thread row  \n");

    }

}

public class inheritance_interface_02 {
    public static void main(String[] args) {

        reading lab = new reading();
        lab.reachdad();
        lab.thinkandgroth();
        lab.mahabharat();
        lab.ramayan();
        lab.java();
        lab.cpp();

    }

}
