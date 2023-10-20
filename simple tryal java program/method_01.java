public class method_01 {
    public static void main(String[] args) {
        System.out.println("I am ram patil");
        simple();
        add(2, 3);
        multipication(2.2f, 3.3f, 4.4f);
    }

    public static void simple() {
        System.out.println("ram patil");
    }

    public static int add(int x, int y) {
        System.out.println("Addition is : " + x + y);
        return 0;
    }

    public static float multipication(float x, float y, float z) {
        System.out.println("Multipication is : " + x * y * z);
        return 0;
    }

}
