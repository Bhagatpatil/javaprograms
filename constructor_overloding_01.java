// in the program use for constructor overloding and gettre method

class rectangle {

    private int lenghth;
    private int breath;

    public rectangle(int lenghth, int breath) {
        this.lenghth = lenghth;
        this.breath = breath;
    }

    public rectangle() {
        this.lenghth = 5;
        this.breath = 6;
    }

    public int getLenghth() {
        return lenghth;
    }

    public int getBreath() {
        return breath;
    }

}

public class constructor_overloding_01 {
    public static void main(String[] args) {
        rectangle obj = new rectangle();
        rectangle obj1 = new rectangle(11, 21);
        System.out.println(obj.getLenghth());
        System.out.println(obj.getBreath());
        System.out.println(obj1.getLenghth());
        System.out.println(obj1.getBreath());

    }

}
