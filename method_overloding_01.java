public class method_overloding_01 {
      
    /*In Java, it is possible for a class to contain two or more methods
     with the same name but with different parameters.
      Such methods are called  methods Overloading. */

     /* in  the program declair a method ovrloding 
       it is declair by method and then calling method

     */
    static void chandu(){
        System.out.println("good morning");
    }
    static void  chandu(String a){
        System.out.println("good morning   " +   a+ " chandu");
    }
    static void  chandu(int a,int b){
        System.out.println("good morning chandu and ramu");
    }
    public static void main(String[] args) {
        chandu();
        chandu("ram ram");
        chandu(3,5);
    }
    

    
}
