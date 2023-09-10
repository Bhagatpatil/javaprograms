public class array_sort {
    public static void main(String[] args) {
        int[] arr = { 34, 56, 60, 78, 100 };
        boolean issort = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                issort = false;
                break;
            }

        }
        if (issort) {
            System.out.println("sorted array");

        } else {
            System.out.println("not sorted array");
        }
    }
}
