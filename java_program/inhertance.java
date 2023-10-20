import java.util.Scanner;

class base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived extends base {
        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

    }
 


public class inhertance {
    public static void main(String[] args) {
        derived obj=new derived();
        obj.setY(31);
        System.out.println(obj.getY());
        obj.setX(51);
        System.out.println(obj.getX());

    }

}
