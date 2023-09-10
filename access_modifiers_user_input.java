import java.util.Scanner;

//in the program use for getter and setter method 

class myemployee {

    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

}

public class access_modifiers_user_input {
    public static void main(String[] args) {
        myemployee obj = new myemployee();
        Scanner sc = new Scanner(System.in);
        System.out.println("entre your Id and name");
        int a;
        String b;
        a = sc.nextInt();
        b = sc.nextLine();

        obj.setId(a);
        System.out.println(obj.getId());

        obj.setName(b);
        System.out.println(obj.getName());

    }

}
