// in the program use for constrctor withaut argument that is default contructor

class demo1 {
    int i, j;

    demo1() {
        i = 10;
        j = 20;
        System.out.println("constructor");
    }

    void add() {
        System.out.println(i + j);
    }
}

public class controctor_withaut_argument {
    public static void main(String[] args) {
        demo1 obj = new demo1();
        obj.add();
        demo1 obj2 = new demo1();
        obj2.add();

    }

}
