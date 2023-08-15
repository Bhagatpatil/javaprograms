public class find_minvalue_in_arra {
    public static void main(String[] args) {
        int[] arr = {1, 12, 23, 34, 45, 56, 67, 78, 89 };
        int min =Integer.MAX_VALUE;  //in the java max value is 2147483647
        for (int e : arr) {
            if (e < min) {
                min = e;
            }

        }
        System.out.println(min);

    }
}
