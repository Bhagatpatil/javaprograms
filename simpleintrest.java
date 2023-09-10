import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        float p,r,n,si,amount;
        System.out.println("entre your principle amaunt");
        p=sc.nextFloat();

         System.out.println("entre your rate of intrest");
        r=sc.nextFloat();

        System.out.println("entre your number of time ");
        n=sc.nextFloat();

        si=(p*r*n)/100;
        amount=si+p;
        
        System.out.println(si);
        System.out.println(amount);

        // it is progrm use for simple intrest calculate any user input



        
                
    }
    
}
