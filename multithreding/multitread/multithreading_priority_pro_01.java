//using extends Thread class 74
package multitread;


class create extends Thread {
    public create(String name) {
        super(name);
    }

    public void run() {
       //in the program if use while condition like this while(i<400) then no use 
       //this program if you use only true value in while condition 
       // stop infinite terminal use ctrl + c 
        while (true) {
            System.out.println("thank you " + this.getName());
          
        }
    }

}

public class multithreading_priority_pro_01 {
    public static void main(String[] args) {
        create t1 = new create("keshav ");
        create t2 = new create("patil");
        create t3 = new create("rameshwar");
        create t4 = new create("elvish");
        create t5 = new create("***********most important");
        create t6 = new create("yadav");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t6.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}
