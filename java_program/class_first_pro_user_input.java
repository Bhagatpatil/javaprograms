import java.util.Scanner;

class employee {
    int id;
    String name;

    public void showdetail() {
        System.out.println(id);
        System.out.println(name);

    }
}

public class class_first_pro_user_input {
    public static void main(String[] args) {
        System.out.println("entre your input");
        Scanner sc=new Scanner(System.in);
        int a; 
        String b;
        a=sc.nextInt();
        b=sc.nextLine();
        employee obj = new employee();

        obj.id = (a);
        obj.name = b;

        obj.showdetail();

    }

}