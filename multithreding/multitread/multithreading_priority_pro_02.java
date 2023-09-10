//using extends Thread class 74
package multitread;

class MyThrs1 extends Thread {
    public MyThrs1(String name) {
        super(name);
    }

    public void run() {
      //in the program if use while condition like this while(i<400) then no use 
       //this program if you use only true value in while condition 
       // stop infinite terminal use ctrl + c 
        while (true) {

            System.out.println("Thank you: " + this.getName());

        }

    }
}

public class multithreading_priority_pro_02 {
    public static void main(String[] args) {
        
        MyThrs1 t1 = new MyThrs1("Harry1");
        MyThrs1 t2 = new MyThrs1("Harry2");
        MyThrs1 t3 = new MyThrs1("Harry3");
        MyThrs1 t4 = new MyThrs1("Harry4");
        MyThrs1 t5 = new MyThrs1("Harry5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
