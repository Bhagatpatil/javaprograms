/*in the program use default method  */

interface GPS {
    void yourlocation();

    void sercharea();

    private void greet() { // it is default method
        System.out.println("good morning");
    }

    default void home() { // it is default method it is else write in subclass
        greet(); // it is in allowed in default method
        System.out.println("my home location as loni kh");
    }

}

interface Camera { // interface

    void clickphoto();

    void clickvideo();

}

interface MXplayer { // interface

    void playmusic();

    void pausmusic();

}

class cellphone { // super class

    cellphone() { // constructor super class
        System.out.println("calling....\n");
    }

}

class smartphone extends cellphone implements GPS, Camera, MXplayer {
    // subclass extends superclass implement interface

    smartphone() { // constructor subclass
        super();
    }

    public void yourlocation() {
        System.out.println("serch your current location");
    }

    public void sercharea() {
        System.out.println("serch any area on world\n");
    }

    public void clickphoto() {
        System.out.println("click your photo");
    }

    public void clickvideo() {
        System.out.println("record your video\n");
    }

    public void playmusic() {
        System.out.println("play your fevorate music ");
    }

    public void pausmusic() {
        System.out.println("paus your music / continue your music \n");
    }

}

public class default_method_01 {
    public static void main(String[] args) {
        smartphone redme = new smartphone();//ctreat object 
        redme.clickphoto();//call method
        redme.clickvideo();//call method
        redme.home(); // default method call in object
        redme.yourlocation();//call method
        redme.sercharea();//call method
        redme.playmusic();//call method
        redme.pausmusic();//call method   

    }

}
