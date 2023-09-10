/*in the program use a method overrinding 
 * method ovrrinding is in  any two class method name is same ,argument is same,
 * return type is same 
 * in the program alarm() method is same name any two class this is method overrinding 
 * when we call super class overred method is not allowed subclass 
 * super class overrinding method call super call object and
 * sub class overrinding method call sub class object ..... 
 */

class Nokia {

    public void call() {
        System.out.println("calling");
    }

    public void game() {
        System.out.println("play game ");

    }

    public void alarm() {
        System.out.println("nokia morning 7:00");
    }

}

class realme extends Nokia {

    public void music() {
        System.out.println("play music on youtube");
    }

    public void camera() {
        System.out.println("click and save your memories");
    }

    @Override
    public void alarm() {

        System.out.println("realme  morning 7:00");

    }

}

public class method_overrinding {
    public static void main(String[] args) {
       
        Nokia obj1 = new Nokia();
        obj1.alarm();

        realme obj = new realme();
        obj.alarm();
        obj.call();
        obj.game();
        obj.music();
        obj.camera();

    }

}
