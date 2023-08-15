public class pattetrn1_recu {
    static void pattern1_recu(int n){
        if(n>0){
            pattern1_recu(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        pattern1_recu(9);
    }
    
}
