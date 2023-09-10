/*in the program use a implement Runnable threading  */
package multitread;

class my1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("ram patil");
        }
    }
}

class my2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("navnath patil");
        }
    }
}

class my3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("k.s patil");
        }

    }
}

public class multithreading_pro_05 {
    public static void main(String[] args) {

        my1 obj1 = new my1();
        Thread t = new Thread(obj1);

        my2 obj2 = new my2();
        Thread t2 = new Thread(obj2);

        my3 obj3 = new my3();   
        Thread t3 = new Thread(obj3);

        t.start();
        t2.start();
        t3.start();

    }

}
