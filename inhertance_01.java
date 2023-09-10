
class vehicle {
    int x;

    public int getX() {
        System.out.println("two viller and for viller");

        return x;
    }

}

class car extends vehicle {
    int y;

    public int getY() {

        System.out.println("\n i have a verana car ");
        System.out.println("car colour is white  and look is awyesome");
        return y;
    }

}

public class inhertance_01 {
    public static void main(String[] args) {
        car obj = new car();
        System.out.println(obj.getY());
        System.out.println(obj.getX());

    }

}
