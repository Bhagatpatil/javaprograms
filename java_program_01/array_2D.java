import java.util.Scanner;

public class array_2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }

    }
}
/*
 * input
 * 3// no of row
 * 4// no of column
 * 1 2 3 4 //enter first row
 * 7 8 9 6 //enter second row
 * 4 5 6 7 //enter thried row
 * 5 // enter serch no
 */

// output : x found at location (2, 1)