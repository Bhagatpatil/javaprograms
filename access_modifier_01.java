import java.util.Scanner;

class student {
    private int rollno;
    private String name;

    public void setRollno(int i) {
        rollno = i;
    }

    public int getRollno() {
        return rollno;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

}

public class access_modifier_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre student rollno and name");
        student obj=new student();
        int rollno;
        String name;

        rollno=sc.nextInt();
        name =sc.nextLine();

        obj.setRollno(rollno);
        System.out.println(obj.getRollno());

        obj.setName(name);
        System.out.println(obj.getName());



       

        

    }
}
