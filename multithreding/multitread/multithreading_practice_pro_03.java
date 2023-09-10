/*in the program use a THread method for setpriority and getpriority */
package multitread;

class priority1 extends Thread {
    public void run() {
        System.out.println("very good ");
    }
}

class priority2 extends Thread {
    public void run() {
        System.out.println("good carrier");
    }
}

public class multithreading_practice_pro_03 {
    public static void main(String[] args) {

        priority1 obj1 = new priority1();
        priority2 obj2 = new priority2();

        obj1.setPriority(4);// setpriority
        obj2.setPriority(9);// setpriority

        System.out.println(obj1.getPriority());// getpriority
        System.out.println(obj2.getPriority());// getpriority

    }
}
