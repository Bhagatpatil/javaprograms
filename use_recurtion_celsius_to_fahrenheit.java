import java.util.Scanner;
public class use_recurtion_celsius_to_fahrenheit {
    static void celsius(float n){
        
        n=(n * 9.0f/5.0f) + 32 ;  //(°C × 9/5) + 32 = °F
        System.out.println(n);



    }


    public static void main(String[] args) {
        System.out.println("enter your temperature in celsius ");
        Scanner sc=new Scanner(System.in);
        Float n;
        n=sc.nextFloat() ;      
             celsius(n );

        
    }
    
}
