/*in the peogram use a sleep method and try catch ,in implement Runnable Thread */
package multitread;

class sleep1 implements Runnable {

    public void run() {
        while (true) {
            System.out.println("good afternoon");
        }
    }

}

class sleep2 implements Runnable {

    public void run() {
        while (true) {

            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome ****************");
        }
    }
}

public class multithreading_practice_pro_02 {
    public static void main(String[] args) {

        sleep1 obj1 = new sleep1();
        Thread t1 = new Thread(obj1);
        t1.start();

        sleep2 obj2 = new sleep2();
        Thread t2 = new Thread(obj2);
        t2.start();

    }
}
