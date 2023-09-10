public class method_program_02 {

    
      //call method first way
      int ram(int x, int y) {
      
      int z;
      if (x > y) {
      z = x / y;
      
      } else {
      z = x * y;
      
      }
      return z;
      
      }
      
      public static void main(String[] args) {
      int a = 12;
      int b = 4;
      int c;
      method_program_02 obj=new method_program_02() ;
      c=obj.ram(a, b);
      System.out.println(c);
      
      int a1 = 5;
      int b1 = 48;
      int c1;
      
      c1 = obj.ram(a1, b1);
      System.out.println(c1);
      
     


     
   /* // call method second way way

    static int ram(int x, int y) {

        int z;
        if (x > y) {
            z = x / y;

        } else {
            z = x * y;

        }
        return z;

    }

    public static void main(String[] args) {
        int a = 60;
        int b = 4;
        int c;

        c = ram(a, b);
        System.out.println(c);

        int a1 = 5;
        int b1 = 50;
        int c1;

        c1 = ram(a1, b1);
        System.out.println(c1);
        */

    }

}
