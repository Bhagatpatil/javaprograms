//Passing Runnable Thread and name to constructor 73
package multitread;

class Mythr1 implements Runnable{
    public void run() {
        System.out.println("Thread1");
    }
}
class Mythr2 extends Thread{
    Mythr2(Runnable r1, String name)
    {
        super(name);
    }
}

public class multithreading_pro_09 {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1();
        Thread r1 = new Thread(t1);
        r1.start();

        Mythr2 t2 = new Mythr2(r1,"Java");
        t2.start();
        
        System.out.println("The id of thread is "+t2.getId());
        System.out.println("The name of thread is "+t2.getName());
    }
}
