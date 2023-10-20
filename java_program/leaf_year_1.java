import java.util.Scanner;

public class leaf_year_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your year for check leaf or not ");
        int year;
        year=sc.nextInt();
       
        if(year % 4==0){
            System.out.println("leaf year");

        }
        else{
            System.out.println("not leaf year");
        }
        
    }
    
}
