package antion;

class circle {
    public double areaofcircle(int r) {
        double result;
        result = Math.PI * r * r;
        return result;
    }
}

public class ram {
    public static void main(String[] args) {
        circle c = new circle();
        System.out.println(c.areaofcircle(3));

    }
}
