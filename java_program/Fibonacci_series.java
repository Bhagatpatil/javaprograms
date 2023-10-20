import java.util.Scanner;

public class Fibonacci_series {
    // Formula - fib(n-1)+fib(n-2)
    // in this program is perform of fibonacci series
    // fibonacci series is called next number is adition of before tow number

    static int fib(int n) {
        if (n == 0 || n == 1)
            return 1;

        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(fib(i));
        }
    }
}
