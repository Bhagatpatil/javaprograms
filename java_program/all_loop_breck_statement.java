public class all_loop_breck_statement {
    public static void main(String[] args) {

        /*in tha program use for for loop,while loop
         * do while loop ,if statement and breck statement
         */
        
          for(int i=0; i<=20; i++){
          System.out.println(i);
          if(i==10){
          System.out.println(i);
          break;
          }
          }
          System.out.println("****************************");
         

        int a = 0;
        while (a <= 10) {
            System.out.println(a);
            a++;
            if(a==5){
                System.out.println(a);
                break;
            }

        }
        System.out.println("*************************");
       

        int c=0;
        do{
            System.out.println(c);

            c++;
            if(c==6){
                System.out.println(c);
                break;
            }
        }while(c<=10);

    }

}
