/*in the program use inheritance in interface */

interface sampleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class MySampleClass implements childSampleInterface {
    public void meth1() {
        System.out.println("meth 1");
    }

    public void meth2() {
        System.out.println("meth 2");
    }

    public void meth3() {
        System.out.println("meth 3");
    }

    public void meth4() {
        System.out.println("meth 4");
    }
}

public class inheritance_interface_01 {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}