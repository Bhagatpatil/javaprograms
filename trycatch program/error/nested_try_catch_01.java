/*
in the program use nested try catch exception handle
 * it is use handle more than error of ine time
 * 82
 */
package error;

import java.util.Scanner;;

public class nested_try_catch_01 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 50;
        arr[1] = 60;
        arr[2] = 70;
        arr[3] = 80;
        arr[4] = 90;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {

            System.out.println("\nenter your index of array");
            int indexno;
            indexno = sc.nextInt();
            System.out.println("enter no of divide by array value");
            int divno;
            divno = sc.nextInt();

            try {

                try {
                    if (indexno == arr[indexno] || divno == 0) {
                        System.out.println("\nyour index value  Cannot divide by zero  ");
                        System.out.println("resion :- Arithmetic  Exception");
                    } else {

                        System.out.println("your enter index value : " + arr[indexno]);
                        System.out.println("value are divide by " + divno + ": " + arr[indexno] / divno + "\n");
                        flag = false;

                    }
                } catch (Exception e) {

                    System.out.println("your enter index is out of array index 5: ");
                    System.out.println(e);

                }

            } catch (Exception e) {

            }
        }
        System.out.println("**you are succesfully run' thanks for visit the program \n\n");

    }

}
/*       input 
enter your index of array
4
enter no of divide by array value
0

your index value  Cannot divide by zero
resion :- Arithmetic  Exception

enter your index of array
8
enter no of divide by array value
5
your enter index is out of array endex 5:
java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 5

enter your index of array
4
enter no of divide by array value
5
your enter index value : 90
value are divide by 5: 18

**you are succesfully run' thanks for visit the program */