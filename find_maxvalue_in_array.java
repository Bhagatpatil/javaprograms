public class find_maxvalue_in_array {
    public static void main(String[] args) {
        int[] arr = { 1, 51, 84, 86, 79, 98, 25, 53 };
        int max = 0;
        for (int e : arr) {
            if (e > max) {
                max = e;

            }

        }
        System.out.println(max);
        

    }

}
