interface escuty {

    void escutycotation();

    void efuel();

    void battrybackup();

    void eaverage();

    default void efeedback() { // default method it is else define subclass
        System.out.println("e scuty good' but no long root");
        n();
        System.out.println("\n");

    }

    private void n() {
        System.out.println("thanks for visit");
    }

}

interface platina {

    void cotation();

    void fuel();

    void average();

    default void pfeedback() {// default method it is else define subclass
        System.out.println("platina very good' exelent'long root ");
        n();
        System.out.println("\n");
    }

    private void n() {
        System.out.println("thanks for visit");
    }

}

interface CT100 {

    void CTcotation();

    void CTfuel();

    void CTaverage();

    default void CTfeedback() {// default method it is else define subclass
        System.out.println("CT 100 good 'but no saticfied");
        n();
        System.out.println("\n");
    }

    private void n() {
        System.out.println("thanks for visit");
    }

}

class owner {

    owner() {
        System.out.println("    RAHUL BAJAJ ");
    }

}

class Bajaj extends owner implements escuty, platina, CT100 {

    Bajaj() {
        super();
    }

    @Override
    public void escutycotation() {
        System.out.println("e scuty cotation on road 87000-/ all GST");

    }

    @Override
    public void efuel() {
        System.out.println("e scuty fuel is electric power");

    }

    @Override
    public void battrybackup() {
        System.out.println("e scuty battry 12 watt per kilometer");

    }

    @Override
    public void eaverage() {
        System.out.println("e scuty 70km after fully charge ");

    }

    @Override
    public void cotation() {
        System.out.println("platina cotation on road 97000-/ all GST");

    }

    @Override
    public void fuel() {
        System.out.println("platina fuel petrol");

    }

    @Override
    public void average() {
        System.out.println("platina average 1L/pr 75km");

    }

    @Override
    public void CTcotation() {
        System.out.println("CT 100 cotation on road 8500-/ all GST");

    }

    @Override
    public void CTfuel() {
        System.out.println("CT 100 fuel petrol");

    }

    @Override
    public void CTaverage() {
        System.out.println("CT 100 average 1L/pr 72km");

    }

}

public class default_method_02 {

    public static void main(String[] args) {
        Bajaj auto = new Bajaj();
        auto.escutycotation();
        auto.efuel();
        auto.battrybackup();
        auto.eaverage();
        auto.efeedback();// call default method in object

        auto.cotation();
        auto.fuel();
        auto.average();
        auto.pfeedback();// call default method in object

        auto.CTcotation();
        auto.CTfuel();
        auto.CTaverage();
        auto.CTfeedback();// call default method in object

    }

}
