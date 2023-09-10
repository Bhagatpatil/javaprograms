//3.	Create a class Square with a method to initialize its side, calculating area, perimeter etc.
//4.	Create a class Rectangle & problem 3.
// formula of area of rectangle : A=w*l
// formula of perimeter of rectangle :  P=2(l+w)

class rectangle {
    int A, w=2, l=3, p;

    public void areaofrectangle() {
        System.out.println(A = w * l);
    }

    public void perimeterofrectangle() {
        System.out.println(p = 2 * (l + w));
    }

}

public class class_07 {
    public static void main(String[] args) {

        rectangle obj=new rectangle();

        obj.areaofrectangle();
        obj.perimeterofrectangle();

    }

}
