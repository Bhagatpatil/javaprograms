public class use_method_change_array_element {

    /*
      in the program use method and forcefully change the array element
      it result is succesfully and change the array element show output
      and then print the array element then check array is soeted and not
     */

     // in the program use a colling method ,for each loop,and sorted the array element

    static void change(int arr[]) {

        arr[0] = 11;
        arr[1] = 21;

    }

    public static void main(String[] args) {
        int[] room = { 45, 65, 31, 41, 51, 61, 71, 91 };
        change(room);

        System.out.println(room[0]);
        System.out.println(room[1]);

        System.out.println("******************************");

        for (int r : room) {
            System.out.println(r);
        }

        System.out.println("**********************************");

        boolean issorted = true;

        for (int i = 0; i < room.length - 1; i++) {

            if (room[i] > room[i + 1]) {
                issorted = false;
                break;

            }
        }
        if (issorted) {
            System.out.println("this array is sorted");
        } else {
            System.out.println("this array is not sorted");
        }

    }
}
