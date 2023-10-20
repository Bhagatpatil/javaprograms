import java.util.Scanner;

class demo2 {
    int salary;
    String name;

    public int getsalary() {
        return salary;

    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

}

public class employee {
    public static void main(String[] args) {

        demo2 obj = new demo2();
        obj.setname("ram patil");
        obj.salary = (34);
        System.out.println(obj.getsalary());
        System.out.println(obj.getname());
    }
}
