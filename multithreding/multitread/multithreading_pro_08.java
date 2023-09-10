//Passing Runnable Thread and name to constructor
package multitread;
class myth1 implements Runnable {

    public void run() {
        System.out.println("Thread1");
    }
}

class myth extends Thread {

    public myth(Runnable r1, String name) {
        super(name);
    }

}

public class multithreading_pro_08 {
    public static void main(String[] args) {

        myth1 obj1 = new myth1();
        Thread t1= new Thread(obj1);
        t1.start();

        myth obj2= new myth(t1, "ram patil");
        obj2.start();

        System.out.println("Thread ID is : "+obj2.getId());
        System.out.println("Yhread name is : "+obj2.getName());


    }
}
