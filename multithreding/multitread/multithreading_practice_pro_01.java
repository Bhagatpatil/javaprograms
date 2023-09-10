/*in the program practice of extends thread class */
package multitread;

class greet1 extends Thread {

    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("good morning");
        }
    }
}

class greet2 extends Thread {

    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("Welcome");
        }
    }
}

public class multithreading_practice_pro_01 {
    public static void main(String[] args) {

        greet1 obj1 = new greet1();
        obj1.start();
        greet2 obj2 = new greet2();
        obj2.start();

    }
}
