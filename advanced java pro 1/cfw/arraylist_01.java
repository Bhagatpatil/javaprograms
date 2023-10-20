/* 
<> this symbol is generic
in the program use Arraylist it is biledin collection framework
 in Arraylist more than method 
 it's use a handle any array opration like this add element,delete element etc...   
 * 
  */
package cfw;

import java.util.ArrayList;

public class arraylist_01 {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        ArrayList<Integer> obj1 = new ArrayList<>(5);
        obj1.add(111);
        obj1.add(121);
        obj1.add(131);
        obj.add(6);
        obj.add(7);
        obj.add(8);
        obj.add(9);

        obj.add(7);
        obj.add(8);
        obj.add(0, 10);
        obj.add(0, 11);
        obj.addAll(obj1);
        // obj.clear();
        System.out.println(obj.indexOf(7));
        System.out.println(obj.indexOf(23));
        System.out.println(obj.lastIndexOf(8));
        System.out.println(obj.contains(111));
        obj1.set(1, 141);// it is use method set element specfic index like this work add method
        for (int i = 0; i < obj.size(); i++) {
            System.out.print(obj.get(i) + ", ");
        }

        System.out.println("\n\nobj1 ->");
        for (int i = 0; i < obj1.size(); i++) {

            System.out.println(obj1.get(i));

        }
    }
}
