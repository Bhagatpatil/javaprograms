class animal {
    String name;
    String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
class dog extends animal {

        String walk;

        public String getWalk() {
            return walk;
        }

        public void setWalk(String walk) {
            this.walk = walk;
        }

    }



public class inhertance_02 {
    public static void main(String[] args) {
        dog obj=new dog();
        obj.setName("motya ");
        obj.setSound("bhow bhow...");
        System.out.println(obj.getName());
        System.out.println(obj.getSound());

        // subclass

        obj.setWalk("dog go to ");
        System.out.println(obj.getWalk());
        

    }

}
