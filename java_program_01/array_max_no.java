public class array_max_no {
    public static void main(String[] args) {

        int[] arr = { 54, 65, 78, 96, 32, 14, 52 };
        int max = Integer.MAX_VALUE;
        for (int e : arr) {
            if (max > e) {
                max = e;
            }

        }
        System.out.println("in array min value is : " + max);

        int max1 = Integer.MIN_VALUE;
        for (int e : arr) {
            if (max1 < e) {
                max1 = e;
            }

        }
        System.out.println("in array max value is : " + max1);

    }

}

// this is method for java max value and min value
// System.out.println(Integer.MAX_VALUE);
// System.out.println(Integer.MIN_VALUE);
