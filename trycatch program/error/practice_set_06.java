/*in the program use custume programer create Exception and
 * use throw and throws keyword and
 * tostring method
 * and print calcolater
 * 
  */
package error;
import java.util.Scanner;

class notzeroargument extends Exception {

    public String toString() {
        return "it's no allowed zero argument";
    }
}

class notsomeargument extends Exception {
    public String toString() {
        return "it's no allowed some argument";
    }
}

class not_1_argument extends Exception{
    public String toString(){
        return "it's no allowed 1 argument";
    }
}



class calculater {

    public static double add(int x, int y) throws notzeroargument {
        if (x == 0 || y==0) {
            throw new notzeroargument();
        }
        return x + y;

    }

    public static double sub(int x, int y) throws notsomeargument {
        if (x == y) {
            throw new notsomeargument();
        }
        return x - y;

    }

    public static double mul(int x, int y) throws not_1_argument{
        if(x==1 || y==1){
            throw new not_1_argument();
        }
        return x * y;

    }

    public static double div(int x, int y) throws notzeroargument{
        if(x==0 || 0>y){
            throw new notzeroargument();
        }
        return x / y;

    }
}

public class practice_set_06 {
    public static void main(String[] args) throws notzeroargument, notsomeargument,not_1_argument {
        Scanner sc = new Scanner(System.in);
        

        calculater c = new calculater();
        System.out.println("Addition : "+c.add(5, 5));
        System.out.println("substraction :  "+c.sub(3, 2));
        System.out.println("multipication : "+c.mul(4, 4));
        System.out.println("divide : "+c.div(5, -1));

    }
}
