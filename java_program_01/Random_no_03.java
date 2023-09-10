import java.util.Random;

class A {
   public  int a;

    A() {
        Random rand = new Random();
        a = rand.nextInt(50);
        System.out.println(a);
    }
    

}

public class Random_no_03 {
    public static void main(String[] args) {
        A b = new A();
    }

}
