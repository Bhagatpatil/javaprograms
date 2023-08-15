//in the program use for contructor overloding with argument and without argument

class ram{
    int i;
    int j;

    ram(int x, int y){
        i=x;
        j=y;
        System.out.println("contructor with argument");

    }
    ram(){
        i=10;
        j=20;
        System.out.println("contructor without argument");
    }

    void show(){
        System.out.println(i+j);
    }

}

public class constructor_overloding {
    public static void main(String[] args) {
        ram obj=new ram(5,6);
        ram obj1=new ram();

        obj.show();
        obj1.show();
        
    }
    
}
