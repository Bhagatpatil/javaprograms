/*in the program use a implement Runnable threading  */
package multitread;

import java.util.Random;

class s1 implements Runnable {
    public int a;

    public s1() {
        Random rand = new Random();
        a = rand.nextInt(50);

    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(a);
        }
    }
}

class s2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("ram");
        }
    }

}

public class multithreading_pro_06 {
    public static void main(String[] args) {
        s1 obj1 = new s1();
        Thread t1 = new Thread(obj1);
        t1.start();

        s2 obj2 = new s2();
        Thread t2 = new Thread(obj2);
        t2.start();

    }

}
