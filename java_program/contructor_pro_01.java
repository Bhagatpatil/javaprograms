class cylender{
    int highth;
    int redias;
    
    public cylender(int highth, int redias) {
        this.highth = highth;
        this.redias = redias;
    }

    public float volumeofcylender() {
        return 3.14f * (redias * redias) * highth;

    }

    public double sarfaceareacylender() {
        return 2 * Math.PI* redias * redias + 2 * 3.14 * redias * highth;

    }

    
}

public class contructor_pro_01 {
    public static void main(String[] args) {

        cylender obj= new cylender(3, 4);
        System.out.println("volume of cylender : " + obj.volumeofcylender());
        System.out.println("sarface area of cylender : "+  obj.sarfaceareacylender());
        
        
    }
    
}
