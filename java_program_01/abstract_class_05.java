abstract class pen{
    abstract public  void write();
   abstract  public void refill();
}
class fountenpen extends pen{
    public  void write(){
        System.out.println("write");
    }
     public void refill(){
        System.out.println("refill");

     }
     public void changenib(){
        System.out.println("changing the nib");
     }

}


public class abstract_class_05 {
    public static void main(String[] args) {
        fountenpen pen = new fountenpen();
        pen.write();
        pen.refill();
        pen.changenib();
        
    }
    
}
