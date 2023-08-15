/*inthe program use for getter and setter  and method 
and calculate the volumeofcylender(),sarfaceareacylender()
*/
// math.PI = 3.14    math.PI is use PI value in program
// optional for math.PI or 3.14

import java.util.Scanner;

class cylender {

    private int highth;
    private int redias;

    public int getHighth() {
        return highth;
    }

    public void setHighth(int highth) {
        this.highth = highth;
    }

    public int getRedias() {
        return redias;
    }

    public void setRedias(int redias) {
        this.redias = redias;
    }

    public float volumeofcylender() {
        return 3.14f * (redias * redias) * highth;

    }

    public double sarfaceareacylender() {
        return 2 * Math.PI * redias * redias + 2 * 3.14 * redias * highth;

    }

}

public class getter_setter_pro {

    public static void main(String[] args) {
        System.out.println("entre your cylender highth ");
        System.out.println("entre your cylender redius");
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();

        cylender obj = new cylender();     //creting object 

        obj.setHighth(a);
        System.out.println(obj.getHighth());
        obj.setRedias(b);
        System.out.println(obj.getRedias());
        System.out.println("volume of cylender   " + obj.volumeofcylender());
        System.out.println("surface area of cylender   " + obj.sarfaceareacylender()+"\n");

    }

}
