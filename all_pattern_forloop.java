import java.util.Scanner;

public class all_pattern_forloop {
    public static void main(String[] args) {
        /*
         * int n=5;
         * //squre pqttern
         * for(int i=0; i<n; i++){
         * for(int j=0; j<n; j++){
         * System.out.print("* ");
         * 
         * }
         * System.out.println("");
         * }
         */

        /*
         * int n=5;
         * // right angle
         * 
         * for(int i=0; i<n; i++){
         * for(int j=i; j<n; j++){
         * System.out.print("*");
         * }
         * 
         * System.out.println("");
         * }
         */

        /*
         * int n = 5;
         * for (int i = 1; i <= n; i++) {
         * for (int j = i; j <= n; j++) {
         * System.out.print("");
         * }
         * for (int j = 1; j <= i; j++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        /*
         * 
         * int n= 5;
         * for (int i = 1; i<=n ; i++) {
         * for (int j = 1; j<=i; j++) {
         * System.out.print("");
         * }
         * for (int j = i; j<=n; j++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        /*
         * int n = 5;
         * for (int i = 0; i <= n; i++) {
         * for (int j = 1; j <=i; j++) {
         * System.out.print("*");
         * }
         * System.out.println("    ");
         * }
         */
    }
}
