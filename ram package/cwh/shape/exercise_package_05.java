package cwh.shape;
class rectangle {
    // perimeter of rectangle = P=2(l+w)
    // area of rectangle = A=wl

    public int w = 2;
    public int l = 3;
    public int A;
    public int P;
    public int a = 4;
    public int r = 3;
    public double ar;

    public void areaofrectangle() {
        A = w * l;
        System.out.println(A);
    }

    public void perimeterofrectangle() {
        P = 2 * l * w;
        System.out.println(P);
    }
}

class squre extends rectangle {
    // area of squre = A=a2
    // perimeter of squre = P=4a

    public void areaofsqure() {
        A = a * a;
        System.out.println(A);
    }

    public void perimeterofsqure() {
        P = 4 * a;
        System.out.println(P);
    }

}

class circle extends squre {

    // area of circle = A=π*r*r
    // circumferance of circle = C=2πr

    public void areaofcircle() {
        ar = Math.PI * r * r;
        System.out.println(ar);
    }

    public void circumferanceofcircle() {
        ar = 2 * Math.PI * r;
        System.out.println(ar);
    }

}

class sphere extends circle {
    // surface area of sphere = A=4πr2;
    // volume of sphere = V=4/3*Math.PI*r*r*r;

    public void surfaceareaofsphere() {
        ar = 4 * Math.PI * r * r ;
        System.out.println(ar);
    }

    public void volumeofsphere() {
        ar = 4.0 / 3.0 * Math.PI * r * r * r;
        System.out.println(ar);
    }

}

public class exercise_package_05 {
    public static void main(String[] args) {

        sphere obj1 = new sphere();
        obj1.areaofrectangle();
        obj1.perimeterofrectangle();
        obj1.areaofsqure();
        obj1.perimeterofsqure();
        obj1.areaofcircle();
        obj1.circumferanceofcircle();
        obj1.surfaceareaofsphere();
        obj1.volumeofsphere();
    }

}
