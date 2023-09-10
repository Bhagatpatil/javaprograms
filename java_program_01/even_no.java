public class even_no {
    public static void main(String[] args) {
        // odd number
        int n = 10;
        System.out.println("odd number");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + (i = i + 1));
        }
        System.out.println("\n**************************");

        // even number
        int e = 10;
        System.out.println("even number");
        for (int i = 1; i < e; i++) {
            System.out.print(" " + i * 2);
        }
    }

}
