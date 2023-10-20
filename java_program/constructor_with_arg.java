// in the program use for constructor with argument
class test {
    int i, j;

    test(int x, int y) {
        i = x;
        j = y;
        System.out.println("constructor_with_arg");

    }

    void show() {
        System.out.println("\n" + i * j);

    }

}

public class constructor_with_arg {
    public static void main(String[] args) {
        test obj = new test(12, 34);
        test obj2 = new test(45, 56);
        test obj3 = new test(4, 5);

        obj.show();
        obj2.show();
        obj3.show();

    }

}
