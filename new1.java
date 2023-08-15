class ram {
    int id;
    String name;

    public void show() {
        System.out.println(id);
        System.out.println(name);
    }
}

public class new1 {

    public static void main(String[] args) {

        ram obj = new ram();
        obj.id = 12;
        obj.name = "bhagat";

        obj.show();
    }

}
