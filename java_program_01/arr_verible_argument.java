// in the program use a veriable argument and recursion
public class arr_verible_argument {

    static int sum(int... arr) { // veriable argument
        int result = 0;
        for (int e : arr) {

            result += e; // recursion
        }
        return result;
    }

    static int multiple(int... arr) { // veriable argument
        int a = 1;
        for (int e : arr) {
            a *= e; // recursion
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("addtion is : " + sum(4, 5));
        System.out.println("addtion is : " + sum(4, 5, 6));
        System.out.println("addtion is : " + sum(4, 5, 7, 5));
        System.out.println("addtion is : " + sum(4, 5, 2, 3, 4) + "\n");

        System.out.println("multipication is : " + multiple(4, 5));
        System.out.println("multupication is : " + multiple(2, 3, 4));
    }

}