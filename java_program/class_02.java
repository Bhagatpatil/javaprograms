import java.util.Scanner;

class Myprofile {
    String name;
    String collegename;
    String Class;
    int rollno;
    int collegeid;
    long mobile;
    float marks;
    String adress;

    public void showprofile() {
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        System.out.println("# My Name : " + name);
        System.out.println("# class : " + Class);
        System.out.println("# college : " + collegename);
        System.out.println("# Roll no : " + rollno);
        System.out.println("# College Id : " + collegeid);
        System.out.println("# Contect NO : " + mobile);
        System.out.println("# Last Year Mark : " + marks);
        System.out.println("# Adress : " + adress);

        System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

    }

    public void Welcome() {

        System.out.println("");
        System.out.println("        :: Welcome my profile ::\n");
    }

    public void thanks() {
        System.out.println("");
        System.out.println("!! Thanks for visit my profile have a nice day !!\n");
    }

}

public class class_02 {
    public static void main(String[] args) {

        Myprofile obj = new Myprofile();

        obj.name = "Bhagat Rameshwar Durgadas";
        obj.Class = "BSC.CS";
        obj.collegename = "DITMS Ch.Sambhajinagar";
        obj.rollno = (01);
        obj.collegeid = (2122000180);
        obj.mobile = (9730365780l);
        obj.marks = (69.70f);
        obj.adress = ("Chiktgaon. Tq: vaijapr");

        obj.Welcome();
        obj.showprofile();
        obj.thanks();

    }

}
