/*in the program use a implement Runnable threading  */

package multitread;

class mythreads1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("i am a thread implement Runnable 1");
        }
    }
}

class mythreads2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("i am a thread implement Runnable 2");
        }
    }
}

public class multithreading_pro_04 {
    public static void main(String[] args) {

        mythreads1 bulleat1 = new mythreads1();
        Thread gun1 = new Thread(bulleat1);

        mythreads2 bulleat2 = new mythreads2();
        Thread gun2 = new Thread(bulleat2);
        

        gun1.start();
        gun2.start();

    }
}
