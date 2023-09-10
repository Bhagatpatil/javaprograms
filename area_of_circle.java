//Create a class circle  with a method to initialize its , calculating area, perimeter
// formula of area of circle : A=πr2
// formula of perimeter of circle : C=2πr

class circle {
    float A;
    int r = 3;
    float C;
    float d = 3.14f;

    public void areaofcircle() {
        System.out.println(A = (d * r * r));
    }

    public void perimeterofcircle() {
        System.out.println(C = (2 * d * r));
    }
}

public class area_of_circle {
    public static void main(String[] args) {

        circle obj = new circle();

        obj.areaofcircle();
        obj.perimeterofcircle();

    }

}
