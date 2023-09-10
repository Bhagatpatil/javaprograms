
/*in the program use a array and print the multipication matrix */

import java.util.Scanner;

public class array_matrix_multipication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ram = new int[3][3];
        int[][] ram1 = new int[3][3];
        int[][] ram2 = new int[3][3];
        System.out.println("enter first matrix");
        for (int i = 0; i < ram.length; i++) {
            for (int j = 0; j < ram.length; j++) {
                ram[i][j] = sc.nextInt();
            }

        }
        System.out.println("enter second matrix");
        for (int i = 0; i < ram1.length; i++) {
            for (int j = 0; j < ram1.length; j++) {
                ram1[i][j] = sc.nextInt();
            }
        }
        System.out.println("your first matrix");
        for (int i = 0; i < ram.length; i++) {
            for (int j = 0; j < ram.length; j++) {
                System.out.print(" " + ram[i][j]);

            }
            System.out.println();
        }

        System.out.println("your second matrix");
        for (int i = 0; i < ram1.length; i++) {
            for (int j = 0; j < ram1.length; j++) {
                System.out.print(" " + ram1[i][j]);

            }
            System.out.println();
        }
        System.out.println(" matrix multippcation ");
        for (int i = 0; i < ram.length; i++) {
            for (int j = 0; j < ram1.length; j++) {
                System.out.print(" " + (ram2[i][j] = (ram[i][j] * ram1[i][j])));
            }
            System.out.println("");
        }

    }

}
