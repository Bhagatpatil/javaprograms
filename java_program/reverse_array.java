public class reverse_array {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400, 500,600,700,800,900,1000 };
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            temp=arr[i];
            arr[i]=arr[l-i-1 ];
            arr[l-i-1]=temp;


        }
        for(int e:arr){
            System.out.println(e);
        }

    }

}
