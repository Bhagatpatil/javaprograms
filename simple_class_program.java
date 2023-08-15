

class myemployee{
    int id;
    String name;

        public void show(){
            System.out.println(id);
        }

        public void seen(){
            System.out.println(name);
        }


}

public class simple_class_program {
    public static void main(String[] args) {
        myemployee obj=new myemployee();

        obj.id=11;
        obj.name="ram";

        System.out.println(obj.id);
        System.out.println(obj.name);

        obj.show();
        obj.seen();
        
    }
    
}
