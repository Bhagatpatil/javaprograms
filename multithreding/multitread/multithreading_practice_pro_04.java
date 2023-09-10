/*in the program use a implement Runnable Thread 
 * in the use getstate() method of state of Thread
 * Thred state type is new , Runnable,blocked ,watting,terminated etc....
 * 
 */
  package multitread;

class state1 implements Runnable {

    public void run() {
        System.out.println("I love you");
    }
}

class state2 implements Runnable {

    public void run() {
        System.out.println("I hate you");
    }
}

public class multithreading_practice_pro_04 {
    public static void main(String[] args) {
        state1 obj1 = new state1();
        Thread t1 = new Thread(obj1);

        state2 obj2 = new state2();
        Thread t2 = new Thread(obj2);

        System.out.println(t1.getState());// state of tread before start is output new
        System.out.println(t2.getState());// state of tread before start is output new

        t1.start();
        t2.start();

        System.out.println(t1.getState());// getstate Thread method after start is runnable
        System.out.println(t2.getState());// getstate Thread method after start is runnable

    }
}

