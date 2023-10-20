package antion;

@FunctionalInterface
interface myinterface {

    void display();
}

class mydeprecated {

    @Deprecated
    public static void name() {
        System.out.println("my name is rameshwar");

    }
}

public class practice_set_01 {
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {

        // deprecreted
        mydeprecated d = new mydeprecated();
        d.name();// no problem for run this method but,this method is deprecated

        // interface
        myinterface my = new myinterface() {
            @Override
            public void display() {
                System.out.println("my name ");
            }
        };
        my.display();

        // lambda expresion
        myinterface my1 = () -> {
            System.out.println("bhagat patil chiktagaon ");
        };
        my1.display();

    }
}
