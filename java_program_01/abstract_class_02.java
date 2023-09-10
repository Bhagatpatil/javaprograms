/*in the program use abstract class and abstract method */

abstract class fourwhiller {

    fourwhiller() {
        System.out.println("\n# below is  four whiller available model detail");

    }

    abstract public int sitter(int a);

    abstract public String headlightshape(String b);

    abstract public String headlighttype(String c);

    abstract public String colour(String r);

}

class innova extends fourwhiller {
    @Override
    public int sitter(int a) {
        System.out.println("  innova crysta is " + a + " sitter");
        return a;

    }

    @Override
    public String headlightshape(String b) {
        System.out.println("  innova crysta headlight shape is : " + b);
        return b;
    }

    @Override
    public String headlighttype(String c) {
        System.out.println("  innova crysta headlight type : " + c);
        return c;
    }

    @Override
    public String colour(String r) {
        System.out.println("  innova crysta avilable colour : " + r + "\n");
        return r;
    }

}

class ertiga extends fourwhiller {
    @Override
    public int sitter(int a) {
        System.out.println("  ertiga zxi+ is " + a + " sitter");
        return a;
    }

    @Override
    public String headlightshape(String b) {
        System.out.println("  ertiga zxi+ headlight shape is : " + b);
        return b;
    }

    @Override
    public String headlighttype(String c) {
        System.out.println("  ertiga zxi+ headlight type is : " + c);
        return c;
    }

    @Override
    public String colour(String r) {
        System.out.println("  ertiga zxi+ avilabel colour : " + r + "\n");
        return r;
    }

}

class BMW extends fourwhiller {
    @Override
    public int sitter(int a) {
        System.out.println("  BMW x5 is " + a + " sitter");
        return a;
    }

    @Override
    public String headlightshape(String b) {
        System.out.println("  BMW x5 headlight shape is : " + b);
        return b;
    }

    @Override
    public String headlighttype(String c) {
        System.out.println("  BMW x5 headlight type is : " + c);
        return c;
    }

    @Override
    public String colour(String r) {
        System.out.println("  BMW x5 avilabel color : " + r + "\n");
        return r;
    }

}

class THAR extends fourwhiller {
    @Override
    public int sitter(int a) {
        System.out.println("  THAR is " + a + " sitter");
        return a;
    }

    @Override
    public String headlightshape(String b) {
        System.out.println("  THAR headlight shape is : " + b);
        return b;
    }

    @Override
    public String headlighttype(String c) {
        System.out.println("  THAR headlight type is : " + c);
        return c;
    }

    @Override
    public String colour(String r) {
        System.out.println("  THAR avilabel colour : " + r + "\n");
        return r;
    }
}

public class abstract_class_02 {
    public static void main(String[] args) {
        innova crysta = new innova();
        crysta.sitter(8);
        crysta.headlightshape("circle");
        crysta.headlighttype("LED");
        crysta.colour("white,black");

        ertiga z = new ertiga();
        z.sitter(7);
        z.headlightshape("triangle ");
        z.headlighttype("Cob Led Ultra White ");
        z.colour("Splendid Silver, Metallic Magma Grey");

        BMW x5 = new BMW();
        x5.sitter(5);
        x5.headlightshape("halogen");
        x5.headlighttype("LED Headlights/Taillights as standard");
        x5.colour("Alpine White, Black Sapphire Metallic, ");

        THAR black = new THAR();
        black.sitter(4);
        black.headlightshape("circle");
        black.headlighttype("halogen rallye bulb");
        black.colour("Red Rage, Galaxy Grey, Napoli Black");

    }

}
