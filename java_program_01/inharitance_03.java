
class circle {

    public int redius;

    circle(int r) {
        System.out.println("I am  constructor of circle class ");
        this.redius = r;
    }

    public double areaofcircle() {
        System.out.println(" area of circle");

        return Math.PI * this.redius * this.redius;

    }

}

class cylender extends circle {

    public int height;

    cylender(int r, int h) {
        super(r);
        System.out.println("I am contructor of class cylender");
        this.height = h;

    }

    public double volumeofcylender() {
        System.out.println(" volume of cylender");
        
        return Math.PI * this.redius * this.redius * this.height;

    }

}

public class inharitance_03 {
    public static void main(String[] args) {
        cylender obj = new cylender(2, 3);
        System.out.println(obj.areaofcircle());
        System.out.println(obj.volumeofcylender());

    }

}
