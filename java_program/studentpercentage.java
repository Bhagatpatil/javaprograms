/*Write a program to find out whether a student
 is pass or fail; if it requires a total of 40% 
 and at least 33% in each subject to pass. Assume
  3 subjects and take marks as input from the user.*/

import java.util.Scanner;

public class studentpercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("enter your physics mark");
        m1=sc.nextInt();
        System.out.println("enter your chemistry mark");
        m2=sc.nextInt();
        System.out.println("enter your mathmatics mark");
        m3=sc.nextInt();

        float totalmark=(m1+m2+m3)/3.0f;
        System.out.println("your overall persentage is  "+ totalmark);
        if(totalmark>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congratulation you have pramoted");
        }else{
            System.out.println("sorry, you are not pramoted plz try again");
        }

        
    }
    
}
