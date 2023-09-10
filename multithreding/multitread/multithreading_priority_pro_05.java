//using implement Runnable  74
package multitread;

class lap1 implements Runnable {

    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("*************");
        }
    }
}

class lap2 implements Runnable {

    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$");
        }
    }
}

public class multithreading_priority_pro_05 {
    public static void main(String[] args) {

        lap1 obj1 = new lap1();
        Thread t1 = new Thread(obj1);

        lap2 obj2 = new lap2();
        Thread t2 = new Thread(obj2);

        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }
}
