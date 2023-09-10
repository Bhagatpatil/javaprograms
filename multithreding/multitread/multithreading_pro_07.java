/*in the program use for thread(String name) and print id and name of thread*/

package multitread;

class phone extends Thread {

    public phone(String name) {
        super(name);
        System.out.println("i am phone class constructor");

    }

    public void run() {

        System.out.println(" i am a thread");
    }
}

public class multithreading_pro_07 {
    public static void main(String[] args) {

        phone obj1 = new phone("ram");
        phone obj2 = new phone("navnath patil");
        obj1.start();
        obj2.start();
        System.out.println("thread ID is : " + obj1.getId());
        System.out.println("thread name is : " + obj1.getName());
        System.out.println("\nthread ID is : " + obj2.getId());
        System.out.println("thread name is : " + obj2.getName());

    }
}
