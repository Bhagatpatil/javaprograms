import java.util.Scanner;
public class input_array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     /*   
        int [] marks= new int [4];
        marks[0]=200;
        marks[1]=272;
        marks[2]=262;
        marks[3]=256;
          
        
        System.out.println(marks[0]);
        */

      /*  int [] marks={100,200,300,400,500,600};
        System.out.println(marks[3]);

        */

        String[] student={"ram","sham","chandu","vishal","suvarna"};
        //print any simple way
       /* System.out.println(student[0]);
        System.out.println(" ");

        // print use by for loop 
        for(int i=0; i<=student.length; i++){
            System.out.println(student[i]);
        }*/

         /*   //use for loop in reverse order
            for(int i=student.length -1; i>=0; i--){
            System.out.println(student[i]);
        }*/

        // using for each loop
        for(String element:student){
            System.out.println(element);
        }


        
    }
    
}
