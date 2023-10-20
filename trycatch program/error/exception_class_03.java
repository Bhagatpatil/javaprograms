
/*83*/
package error;
import java.util.Scanner;
class exage extends Exception{

    public String toString(){
        return " age not allowed abow 125";
    }
}

public class exception_class_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age");
        int age;
        age=sc.nextInt();
        if(age<125){
            try{
                throw new exage();

            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
        

        

    }
}
