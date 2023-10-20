 public class veriable_argument {
    // more than condition but only one method is any condition as perform
    // in the program more than addition only one method use and print output

    static int sum(int ...arr){
        int result =0;
        for(int e:arr){
            result +=e;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));
        System.out.println(sum(2,3,6));
        System.out.println(sum(2,3,9));
        System.out.println(sum(2,3,8,5));
        System.out.println(sum(2,3,7,5,8));
        System.out.println(sum(2,9));
        System.out.println(sum(2,19));


    }
    
}





