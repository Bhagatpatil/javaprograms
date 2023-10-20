public class for_loop_01 {
    public static void main(String[] args) {
        int i;
        int num;
        int table;
        for (num = 1; num <= 10; num++) {
            for (i = 1; i <= 10; i++) {
                table = i * num;
                System.out.print("\t " + table);

            }
              System.out.println("");
        }

    }
}
