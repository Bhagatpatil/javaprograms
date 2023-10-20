class conti{
  
  public static  void  con(){
    for (int i=0; i<20; i++){
            if(i==5 || i==6){
                continue;
            }
            System.out.println(i);
        }
}
}
public class continue1 {

    public static void main(String[] args) {
        conti c= new conti();
        c.con();
    }
    
}
