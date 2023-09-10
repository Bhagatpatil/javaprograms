
interface Camera {
    void clickphoto();

    void saveimage();

    void privateimage();
}

interface call {
    void incomingcall();

    void outgoingcall();

    void recevecall();

    void rejectcall();

    void replymassege();

}

interface contact {
    void savecontact();

    void editcontact();

    void serchcontact();

    void deletecotact();
}

interface Google {
    void serchengine();

    void myaccount();

    void deletehistory();

    void serchimage();

}

class mymobile {
    mymobile() {
        System.out.println("   # realme 3 pro # \n");

    }
}

class iphone extends mymobile implements Camera, call, contact, Google {

    iphone() {
        super();
    }

    @Override
    public void clickphoto() {
        System.out.println("click your beutiful image");

    }

    @Override
    public void saveimage() {
        System.out.println("save your image and memories");

    }

    @Override
    public void privateimage() {
        System.out.println("sent your image private file only see you\n");

    }

    @Override
    public void incomingcall() {
        System.out.println("#matlabi incoming call");
    }

    @Override
    public void outgoingcall() {
        System.out.println("please wait connect your call ");
    }

    @Override
    public void recevecall() {
        System.out.println("#matlabi incoming call please receve");
    }

    @Override
    public void rejectcall() {
        System.out.println("#matlabi she call reject");
    }

    @Override
    public void replymassege() {
        System.out.println("sorry' I have a lab \n");
    }

    @Override
    public void savecontact() {
        System.out.println("save contact of #matlabi");
    }

    @Override
    public void editcontact() {
        System.out.println("edit your save contact ");
    }

    @Override
    public void serchcontact() {
        System.out.println("serch contact like this #matlabi");
    }

    @Override
    public void deletecotact() {
        System.out.println("delete your save contact\n");
    }

    @Override
    public void serchengine() {
        System.out.println("serch your think and take  good suggetion");
    }

    @Override
    public void myaccount() {
        System.out.println("edit your google account and sign in another email ");
    }

    @Override
    public void deletehistory() {
        System.out.println("delete your history");
    }

    @Override
    public void serchimage() {
        System.out.println("upload image and take suggetion\n");
    }

}

public class interface_02 {
    public static void main(String[] args) {
        iphone x = new iphone();
        x.clickphoto();
        x.saveimage();
        x.privateimage();
        x.incomingcall();
        x.outgoingcall();
        x.recevecall();
        x.rejectcall();
        x.replymassege();
        x.savecontact();
        x.editcontact();
        x.serchcontact();
        x.deletecotact();
        x.serchengine();
        x.myaccount();
        x.deletehistory();
        x.serchimage();

    }

}
