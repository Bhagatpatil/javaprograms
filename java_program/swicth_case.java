import java.util.Scanner;

public class swicth_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your task");
        int cal;
        cal = sc.nextInt();
        switch (cal) {
            case 1:
                System.out.println("sonday");
                break;

            case 2:
                System.out.println("monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("friday");
                break;

            case 7:
                System.out.println(" Saturday");
                break;

            default:
                System.out.println("it is wrong");
                break;
        }
        
    }

}
