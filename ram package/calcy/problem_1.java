package calcy;

class calculater {
  public void math1(int a, int b) {
    System.out.println("addition : " + a + b);
  }
}

class sccalculater extends calculater {
  public void meth2(int c, int d) {
    System.out.println("sub : " + (c - d));
  }
}

class hycalculater extends sccalculater {
  public void meth3(int e, int f) {
    System.out.println("sin addition : " + Math.sin(e + f));
  }
}

public class problem_1 {
  public static void main(String[] args) {
    System.out.println("i am a main method");
    /* hycalculater obj = new hycalculater();
   
     * obj.math1(2, 3);
     * obj.meth2(3, 2);
     * obj.meth3(5, 5);
     */
    }
}
