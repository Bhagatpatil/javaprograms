public class sort_array_value {
    public static void main(String[] args) {
        boolean issorted = true;
        int[] num = { 41, 45, 55, 98, 100, 140, 153 };
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                issorted = false;
                break;
            }
        }
        if (issorted) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }
    }

}
