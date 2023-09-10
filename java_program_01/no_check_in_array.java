// in the progran use array and print given no in array yes or no

public class no_check_in_array {
    public static void main(String[] args) {
        float[] arr = { 40.5f, 50.6f, 56.2f, 89.5f, 60.5f, 78.6f };
        float n = 50.6f;
        boolean Isinarray = false;

        for (float e : arr) {

            if (e == n) {
                Isinarray = true;
                break;
            }
        }
        if (Isinarray) {
            System.out.println(" \n Number is present in array");
        } else {
            System.out.println("Number is not present in array\n ");
        }

    }

}
