/*in the program use a generic and create generic class
 *it is generic class
 * => i can no undarstand
 *
 * */
package adj2;

import java.util.ArrayList;

class generic<g> {
    int val = 31;
    private g t;

    public generic(int val, g t) {
        this.val = val;
        this.t = t;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public g getT() {
        return t;
    }

    public void setT(g t) {
        this.t = t;
    }
}

public class generics_01 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(31);
        array.add(21);
        array.add(11);
        array.add(51);

        //  System.out.println("All array print : " + array);

        //   int a = (int) array.get(2);
        //    System.out.println("print array index on 2 value : " + a);

        generic obj = new generic(55, "ram");
        int b = obj.getVal();
        System.out.println(b);


    }
}
