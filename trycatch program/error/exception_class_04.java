package error;
import java.util.Scanner;
class exc extends Exception{

    public String toString(){
        return "i am to string ";
    }

    public String getMessage(){
        return "i am getmessage";
    }
}

public class exception_class_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("enter your number");
         int  a= sc.nextInt();
             
            if(a<10){
             try {
              
              throw new exc();
            //  throw new ArithmeticException();
            
            }catch(Exception e){
              System.out.println(e);
             System.out.println(e.getMessage());
             e.printStackTrace();
            }
             System.out.println("program end");
            
        }
    }
}