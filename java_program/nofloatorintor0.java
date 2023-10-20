import java.util.Scanner;

public class nofloatorintor0 {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your no");
    System.out.println(Sc.hasNextInt());
    int k;
    k = Sc.nextInt();

    if (k == 0) {
      System.out.println("no");

    } else {
      System.out.println(Sc.hasNextInt());
    }

  }

}
