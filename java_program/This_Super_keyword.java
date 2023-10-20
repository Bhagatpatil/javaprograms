/* in the program use by inheritance of constructor declair constructor and
   print value for getter method
   in the program use super keyword 
   super keyword use for doclass object value refar the Ekclass costructor
   
   */ 

   

class Ekclass {
   
    Ekclass(int b) {
        System.out.println(b);
    }

}

class Doclass extends Ekclass {



    public Doclass(int b, int x) {
        super(b);
        System.out.println(x);
    }

}

public class This_Super_keyword {
    public static void main(String[] args) {
        Doclass obj = new Doclass(1, 2);
       

    }

}
