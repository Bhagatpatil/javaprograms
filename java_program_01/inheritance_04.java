class rectangle {
    int width;
    int lengh;

    rectangle(int a,int b) {
        System.out.println("I am constructor of class rectangle");
        this.lengh = a;
        this.width = b;
    }

    public float areaofrectangle() {
        System.out.println("area of rectangle");
        return width * lengh;
    }

}

class cuboid extends rectangle {
      int hieght;
      
    cuboid(int a ,int b, int c){
        super(a , b);
        System.out.println("I am contructor of cuboid");
        this.hieght=c;
        
    }

      public float volumeofcuboid(){
        System.out.println("volume of cuboid");
        return width*hieght*lengh;
      }

}

public class inheritance_04 {
    public static void main(String[] args) {
        cuboid obj = new cuboid(1,2,3);
        System.out.println(obj.areaofrectangle());
        System.out.println(  obj.volumeofcuboid());
        
      

    }

}
