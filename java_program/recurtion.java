import java.util.Scanner;
public class recurtion {
     // a function in java can call itself such calling of function by itself is called recurtion.

    // program is use a method and recurtion print factoriel series
    /*static int fact(int n ){
        if(n==0 || n==1){
            return 1;
            
        }
        else{
            return n*fact(n-1);                // it is recurtion
        }
    }*/

        static int fact1(int n ){
            
        if(n==0 || n==1){
            return 1;
            
        }
        else{
             int p=1;
            for(int i=1; i<=n; i++){
                p *=i;
                
                
            }
            return p;
        }

        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n;
        n=sc.nextInt();
        
       // System.out.println("the value of factoriel n is : "+fact(n));

        System.out.println("the value of factoriel n is : "+fact1(n));
        
    }
    
}
