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

public class multithreading_pro_02 {
    public static void main(String[] args) {
        rameshwar obj1 = new rameshwar();
        navnath obj2 = new navnath();
        obj1.start();
        obj2.start();
        
    }

}
