/*in the program use 3D array  and print 3*3 matrix for user input */

import java.util.Scanner;

public class threeD_array_Example_01 {
    public static void main(String[] args) {

        int[][][] arr = new int[3][3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter matrix index");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    arr[i][j][k] = sc.nextInt();

                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length; k++) {
                    System.out.print(" " + arr[i][j][k]);

                }
                System.out.println();

            }
            System.out.println();

        }

    }

}

// it is input  1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9
/*1 2 3
  4 5 6
  7 8 9

  1 2 3
  4 5 6
  7 8 9

  1 2 3
  4 5 6
  7 8 9    */
 