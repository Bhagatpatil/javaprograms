//Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing

 class Tommyvecetti{

      public void hit(){
        System.out.println("enemy is hitting....");
      }

      public void run(){
        System.out.println("enemy is running....");
      }

      public void fire(){
        System.out.println("enemy is firing....");
      }

 }



public class class_08 {
    public static void main(String[] args) {

        Tommyvecetti obj=new Tommyvecetti();

        obj.hit();
        obj.run();
        obj.fire();
       
        
    }
}
