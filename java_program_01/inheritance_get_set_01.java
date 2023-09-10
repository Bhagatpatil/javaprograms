
class rectangle {

    public int width;
    public int lengh;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLengh() {
        return lengh;
    }

    public void setLengh(int lengh) {
        this.lengh = lengh;
    }

    public float areaofrectangle() {
        System.out.println("area of rectangle");
        return this.width * lengh;
    }
}

class Coboid1 extends rectangle {

    public int hieght;

    public int getHieght() {
        return hieght;
    }

    public void setHieght(int hieght) {
        this.hieght = hieght;
    }

    public float volumeofcuboid() {
        System.out.println("volume of cuboid");
        return width * hieght * lengh;

    }
}

public class inheritance_get_set_01 {
    public static void main(String[] args) {
        Coboid1 obj = new Coboid1();
        obj.setWidth(3);
        obj.setHieght(2);
        obj.setLengh(4);
        System.out.println(obj.getWidth());
        System.out.println(obj.getHieght());
        System.out.println(obj.getLengh());
        System.out.println(obj.areaofrectangle());
        System.out.println(obj.volumeofcuboid());

    }

}
