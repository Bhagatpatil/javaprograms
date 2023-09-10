
import java.util.*;

public class print_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] ram = { { 1, 2, 3, 6 }, { 3, 2, 1, 7 }, { 6, 4, 5, 6 }, { 3, 4, 5, 6 } };

        for (int i = 0; i < ram.length; i++) {
            for (int j = 0; j < ram.length; j++) {
                System.out.print(" " + ram[i][j]);
            }
            System.out.println();
        }

    }

}
