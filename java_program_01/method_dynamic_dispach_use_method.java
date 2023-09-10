
/* in the program use dynamic method dispach
 * in the program class object is referance super class and object is subclass
 * subclass overred method call only in method dispach
 * and if subclass other method call when seprate subclass reference and object 
 * 
 */

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    
    public void music(){
        System.out.println("Playing music...");
    }
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class method_dynamic_dispach_use_method  {
    public static void main(String[] args) {

        Phone obj = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.showTime();
        obj.on();  // in the object call only subclass overred method 
        // obj.music(); Not Allowed

        SmartPhone obj1 = new SmartPhone();
        obj1.music();
        

        Phone obj3=new Phone();
        obj3.on();



    }
}
