
// sarface area of sphere=  A=4πr2
// volume of sphere=  V=43πr3
// diameter of sphere= d=2r
// Math.PI  is 3.14 value in store

class sphere {

    int redius;

    public sphere(int redius) {
        this.redius = redius;
    }

    public float sarfaceareaofsphere() {
        return 4 * 3.14f * redius * redius;
    }

    public double volumeofsphere() {
        return (4.0/ 3.0 )*( Math.PI* redius * redius * redius);
    }

    public float diameterofsphere() {
        return 2 * redius;
    }

}

public class constructor_get_set_pro {
    public static void main(String[] args) {
        sphere obj = new sphere(5);
        System.out.println(obj.sarfaceareaofsphere());
        System.out.println(obj.volumeofsphere());
        System.out.println(obj.diameterofsphere());

    }
}
