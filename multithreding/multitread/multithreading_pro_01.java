/*in the program use extends Thread class and use treading class */

package multitread;

class mythread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("my thread is running");
            System.out.println("i am happy");
            i++;
        }
    }
}

class mythread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("thread 2 is good ");
            System.out.println("i am a sad");
            i++;
        }

    }
}

public class multithreading_pro_01 {
    public static void main(String[] args) {
        mythread1 obj1 = new mythread1();
        mythread2 obj2 = new mythread2();

        obj1.start();
        obj2.start();

    }
}
