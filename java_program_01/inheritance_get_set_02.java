//formula of cube : A=6a2
//formula of cone : A=Math.PI*redius*(redius+hieght)

/*in the program use set ,method,inheritance,costructor
 * and calculate surface area of cube and surface area of cone 
 */
class cube {

    public double a, A;

    public void setA(int a) {
        this.a = a;
    }

    public void meth() {
        System.out.println("surface area of cube");
        A = 6 * a * 2;
        System.out.println(A);

    }

}

class cone extends cube {

    cone(float redius, float hieght) {
        System.out.println("surface area of cone");
        A = Math.PI * redius * (redius + hieght);
        System.out.println(A);
    }

}

public class inheritance_get_set_02 {
    public static void main(String[] args) {
        cone obj = new cone(2.0f, 3.0f);
        obj.setA(2);
        obj.meth();

    }

}
