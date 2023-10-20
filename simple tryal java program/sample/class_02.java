package sample;

class smartphone extends phone {
    @Override
    public void camera() {
        System.out.println(" this is camera ovrriding method");

    }
}

public class class_02 {
    public static void main(String[] args) {
        smartphone phone = new smartphone();
        phone.camera();

    }
}
