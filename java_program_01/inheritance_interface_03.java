/*in the program use inheritance in interface */

interface vits {
    void place1();

}

interface rana {
    void place2();

}

interface vegan extends vits, rana {
    void place3();

}

class hotel implements vegan {

    public void place1() {
        System.out.println("\nhotel vits place stetion road vedant nagar");

    }

    public void place2() {
        System.out.println("hotel rana place stetion road opp fire brigred");

    }

    public void place3() {
        System.out.println("hotel vegan place stetion road near deogiri bank \n");

    }
}

public class inheritance_interface_03 {
    public static void main(String[] args) {
        hotel h = new hotel();
        h.place1();
        h.place2();
        h.place3();

    }

}
