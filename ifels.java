import java.util.Scanner;

public class ifels {
    public static void main(String[] args) {
        System.out.println("entre your age ");
        Scanner sc=new Scanner(System.in);
        int age;
        age=sc.nextInt();
        if(age>=18){
            System.out.println(" voit");
        }else{
            System.out.println("no voit");
        }
        
    }
    
}
