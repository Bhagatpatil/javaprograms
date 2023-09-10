public class use_recurtion_sum_first_nuturel_no {
    // in the project calculate for sum of first (10)natural number 

    static int sum(int a) {
        if (a == 1) {
            return 1;
        }
        return a + sum(a - 1);

       
    }

    //  method practice set problem no 10 
   /* static int sumiterativ(int n){
        if(n==1){
            return 1;
        }
        return n+ sumiterativ(n-1);
    }*/

    public static void main(String[] args) {
         int c = sum(10);
        System.out.println(c);


        /*
        int c = sumiterativ(10);
        System.out.println(c);
        */

        
    }
}
