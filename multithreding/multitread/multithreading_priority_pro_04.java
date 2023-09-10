//using implement Runnable  74
package multitread;

class lighting1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("ram patil");
        }
    }
}

class lighting2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("navnath patil");
        }
    }
}

public class multithreading_priority_pro_04 {
    public static void main(String[] args) {
        lighting1 obj1 = new lighting1();
        Thread t1 = new Thread(obj1);

        lighting2 obj2 = new lighting2();
        Thread t2 = new Thread(obj2);

        t1.setPriority(Thread.MAX_PRIORITY);
        /*
         * t2.setPriority(Thread.MIN_PRIORITY);// not need MIN_PRIORITY becauge jdk
         * allredy normal priority
         */
        t1.start();
        t2.start();

    }

}
