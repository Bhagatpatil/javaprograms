public class use_method_pattern1 {

    static void multi(int a){
        for(int i=0; i<=a; i++){
            for(int j=0; j<i; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        
        multi(5);
        
    }
    
}
