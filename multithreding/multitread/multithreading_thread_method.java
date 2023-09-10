// in the program use a Thread method 75
package multitread;

class mynew1 extends Thread {

    public void run() {
        int i = 0;
        while (true) {
            System.out.println("$$$$$$$$$$$$$$ ");
            //use Thread sleep method
            try{
                Thread.sleep(5);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class mynew2 extends Thread {

    public void run() {
        while (true) {
            System.out.println("good evening");
        }
    }
}

public class multithreading_thread_method {
    public static void main(String[] args) {

        mynew1 obj1 = new mynew1();
        mynew2 obj2 = new mynew2();

        obj1.start();
        // use Thread join method 
      /*  try {
            obj1.join();
        } catch (Exception e) {
            System.out.println(e);
        }*/

        obj2.start();

    }
}
