public class method_program_01 {
   public  static int fun(int x, int y) {
        if (x > y) {

            int z;
            z = x + y;
            return z;
        } else {
            int z;
            z = x * y;
            return z;
        }

    }

    public static void main(String[] args) {
        int a = 11;
        int b = 9;
        int c;
        c = fun(a, b);

        int e = 13;
        int f = 11;
        int g;
        g = fun(e, f);

        int r = 5;
        int y = 9;
        int m;
        m = fun(r, y);
        System.out.println(c);
        System.out.println(g);
        System.out.println(m);
    }
    // abov program use in if else,method call statement 

}
