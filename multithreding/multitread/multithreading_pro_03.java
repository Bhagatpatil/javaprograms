/*in the program use extends Thread class and use treading class */
package multitread;

class rameshwar extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("BHAGAT RAMESHWAR");
            i++;
        }
    }

}

class navnath extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("BHAGAT NAVNATH");
            i++;
        }
    }
}

class chandu extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("chandrakant admane");
            i++;
        }
    }
}

public class multithreading_pro_03 {
    public static void main(String[] args) {
        rameshwar obj1 = new rameshwar();
        navnath obj2 = new navnath();
        chandu obj3 = new chandu();
        obj1.start();
        obj2.start();
        obj3.start();

    }

}