import java.util.Scanner;
public class find_no_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your integer number");
         int num;
         num=sc.nextInt();

        int [] marks={45,56,32,78,98,74,63,11};
        
        boolean isInArray=false;
        for(int element:marks){
            if(num==element){
           isInArray=true;
            break;
            }

            
            }
            if(isInArray){
                System.out.println("this number is present in array");
            }
            else
            {
                System.out.println(" this number is not present in array ");
            }
            //isInArray is variable it is mentioned any name 
            //above program is mentioned by user input present in are yes or not 
            //above program use for each loop,if statement,break statement,and user input statement





            /*float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }*/

        //it is program somr as above program but it is float datatype



        }

        
    }
    
