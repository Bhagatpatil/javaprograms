/*in the program use annotation like this @override annotation,
suppressWarnings,
 * 
 * => @override annotation use for method overriding when we method override then check any problem 
 * like this speling,parameter,etc...
 * 
 * => i no understand @deprecated annotation 
 * 
 * => i no understand @SuppressWarnings annotation
 */
package antion;

class action extends circle {

    @Override //@override annotation
    public double areaofcircle(int r) {
        return Math.PI * r * r;
    }

    @Deprecated //@Deprecated annotation
    public int sum(int x, int y) {
        System.out.println(x + y);
        return 0;
    }

}


public class annotation_pro_01 {
    @SuppressWarnings("deprecation")//@SuppressWarnings annotation
    public static void main(String[] args) {
        action c = new action();
        System.out.println(c.areaofcircle(4));
        c.sum(3, 4);
    }
}
