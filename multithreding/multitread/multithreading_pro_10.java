//Passing Runnable Thread and name to constructor 73
package multitread;

class m1 implements Runnable {
    @Override
    public void run() {
        System.out.println("i am a m1 class of runneble Thread");
    }
}

class m2 extends Thread {

    public m2(Runnable a, String name) {

        super(name);

    }

}

public class multithreading_pro_10 {
    public static void main(String[] args) {

        m1 O = new m1();
        Thread n = new Thread(O);
        n.start();

        m2 b = new m2(n, "Bhagat");
        b.start();

        System.out.println("THread ID is : " + b.getId());
        System.out.println("Thread name is : " + b.getName());

    }

}
