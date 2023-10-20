package error;

import java.util.*;

class myexception1 extends Exception {

    public String toString() {
        return "i am tostring ";
    }

    public String getMessage() {
        return "i am getmessage";
    }
}

public class exception_class_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your b value ");
        int b;
        b = sc.nextInt();
        if (b < 8) {
            try {
                // throw new myexception1();
                throw new ArithmeticException("this is an arithmetic exception ");
                // i can throw any exception like this arithmeticException() in is in biled
                // exception
            } catch (Exception e) {

                System.out.println(e);
                System.out.println(e.getMessage());
                e.printStackTrace();

            }
        }

    }
}
