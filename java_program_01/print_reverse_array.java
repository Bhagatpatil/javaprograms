// in the program use array and print the array in revers order

public class print_reverse_array {
    public static void main(String[] args) {
        int [] arr={5,6,7,8,9,1,2,3,1};
        int l=arr.length;
        int n=Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
    
}
