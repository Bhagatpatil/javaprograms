package error;

import java.util.Scanner;

class MaxAgeException extends Exception {
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}

public class exception_class_05 {
    public static void main(String[] args) {
        System.out.println("enter your age ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 100) {
            try {
                throw new MaxAgeException();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println(e.getMessage());
            }

        }

    }
}
