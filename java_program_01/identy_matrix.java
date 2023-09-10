// in the program use array and print matrix identy or not identy

import java.util.Scanner;

public class identy_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        boolean isidenty = true;
        System.out.println("enter array");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j && arr[i][j] == 1) || (i != j && arr[i][j] == 0)) {

                } else {
                    isidenty = false;

                }

            }
        }
        if (isidenty == true) {
            System.out.println("identy matrix");
        } else {
            System.out.println("not identy matrix");
        }

    }

}
