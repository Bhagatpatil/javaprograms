/*in the program use array and print transpose matrix */

public class matrix_transpose {
    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
        System.out.println("your matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("your transpose matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[j][i]); // [i] replace [j]
            }
            System.out.println();
        }
    }
}

/*
  output
  10 40 70
  20 50 80
  30 60 90
 */