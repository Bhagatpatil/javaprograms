package tstring;

class test {
    int i;
    String name;

    public void setvalue(int i) {
        this.i = i;
    }

    public void show(String name) {
        System.out.println(i);
        System.out.println("ram patil");
        this.name = name;
        System.out.println(name);

    }

    public String toString() {

        return name;
    }

}

public class this_01 {
    public static void main(String[] args) {
        test t = new test();
        t.setvalue(10);
        t.show("name");

    }

}
