import java.util.Scanner;

public class kmtomile {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a kilometer");
        float k ;
        float m = 0.621371f;
        k=Sc.nextFloat();

        float totalmile;
        totalmile=(0.621371f * k);
        System.out.println(totalmile);
        

    }

}
