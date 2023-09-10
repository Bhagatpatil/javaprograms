//using extends Thread class 74
package multitread;
class lighting extends Thread {

    public lighting(String name) {
        super(name);

    }

    public void run() {
        //in the program if use while condition like this while(i<400) then no use 
       //this program if you use only true value in while condition 
       // stop infinite terminal use ctrl + c 
        while (true) {
            System.out.println(this.getName());
        }
    }
}

public class multithreading_priority_pro_03 {
    public static void main(String[] args) {
        lighting t1 = new lighting("ram patil **********");
        lighting t2 = new lighting("navnath patil");
        lighting t3 = new lighting("K.s patil");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }

}
