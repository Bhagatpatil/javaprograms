// in the program print array for two way
// and adiition matrix
// one way= usee input
// two way = compile input

import java.util.Scanner;

public class array_matrix_addition {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] arr1 = new int[3][3];

        System.out.println("enter first matrix");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println("enter second matrix");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                arr1[i][j] = sc.nextInt();
            }

        }
        System.out.println("your first matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j]);

            }
            System.out.println();
        }
        System.out.println("your second matrix");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(" " + arr1[i][j]);

            }
            System.out.println();
        }

        System.out.println("matrix addition ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + (arr[i][j] + arr1[i][j]));

            }
            System.out.println();
        }

        /*
         * int[][]ram = { { 1, 2, 3 ,6}, { 3, 2, 1,7 }, { 6,4, 5, 6 }, {3,4,5,6}};
         * for (int i = 0; i < ram.length; i++) {
         * for (int j = 0; j < ram.length; j++) {
         * System.out.print(" "+ram[i][j]);
         * }
         * System.out.println();
         * }
         */

    }

}
