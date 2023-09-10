abstract class mobilefunction {

    abstract public void setting();

    abstract public void camera();

    abstract public void filemanager();

    abstract public void gmail();

}

class realme extends mobilefunction {

    realme(int a) {

        System.out.println("realme private LMT..");
    }

    @Override
    public void setting() {
        System.out.println("click and change any setting of realme ");
    }

    @Override
    public void camera() {
        System.out.println("click and save memories in realme");
    }

    @Override
    public void filemanager() {
        System.out.println("your save photo and video safe pravicy in realme");
    }

    @Override
    public void gmail() {
        System.out.println("email sent and riseve realme mobile \n ");

    }

}

class vivo extends mobilefunction {

    vivo(int b) {

        System.out.println("vivo private LMT...");
    }

    @Override
    public void setting() {
        System.out.println("click and change any setting of vivo ");
    }

    @Override
    public void camera() {
        System.out.println("click and save memories in vivo");
    }

    @Override
    public void filemanager() {
        System.out.println("your save photo and video safe pravicy in vivo");
    }

    @Override
    public void gmail() {
        System.out.println("email sent and riseve vivo mobile \n  ");

    }

}

class APPLE extends mobilefunction {

    APPLE(int c) {

        System.out.println("APPLE private LMT..");
    }

    @Override
    public void setting() {
        System.out.println("click and change any setting of APPLE ");
    }

    @Override
    public void camera() {
        System.out.println("click and save memories in APPLE");
    }

    @Override
    public void filemanager() {
        System.out.println("your save photo and video safe pravicy in APLLE");
    }

    @Override
    public void gmail() {
        System.out.println("email sent and riseve APPLE mobile \n  ");

    }
}

public class abstract_class_04 {
    public static void main(String[] args) {
        realme pro = new realme(0);
        
        pro.setting();
        pro.camera();
        pro.filemanager();
        pro.gmail();

        vivo y20 = new vivo(0);

        y20.setting();
        y20.camera();
        y20.filemanager();
        y20.gmail();

        APPLE iphone = new APPLE(0);

        iphone.setting();
        iphone.camera();
        iphone.filemanager();
        iphone.gmail();

    }

}
