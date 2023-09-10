
class vehicle {
    String x;

    public String getX() {

        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

}

class truck extends vehicle {
    int y;
    String z;

    public int getY() {
        return y;
    }

    public void setY(int y) {

        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {

        this.z = z;
    }

}

public class inhertance_03 {
    public static void main(String[] args) {
        truck obj = new truck();
        obj.setX("TATA");
        obj.setY(12);
        obj.setZ("35 ton");
        System.out.println("bello is vehicle  company  ");
        System.out.println(obj.getX());
        System.out.println("truck in tyre ");
        System.out.println(obj.getY());
        System.out.println(" truck capacity ");
        System.out.println(obj.getZ());

    }

}
