/*linkedlist implements for deque 
<> this symbol is generic
in the program use linkedlist it is biledin collection framework
 in linkedlist more than method 
 it's use a handle any array opration like this add element,delete element etc...   
 * 
  */
package cfw;

import java.util.LinkedList;

public class linkedlist_01 {
    public static void main(String[] args) {
        LinkedList<Integer> b = new LinkedList<>();// it is create obj biledin Arraylist it is genric int
        LinkedList<String> s = new LinkedList<>();// it is create obj biledin Arraylist it is genric String

        b.add(21);
        b.add(31);
        b.add(41);
        b.add(11);
        b.add(21);

        b.add(1, 51);// it is method use add give index give element
        System.out.println(b.contains(76));// it is method use find give argument in array output in true /false
        System.out.println(b.indexOf(31));// it is method use find index of argument like this 31 index of 2
        System.out.println(b.lastIndexOf(21));// it is use method find some element index but some element last index
        // b.clear();// it is method use clear all output element for array
        b.set(5, 121);// it is use method set element specfic index like this work add method
        b.addLast(777);// it is method use join last element in array for argument it's use only in
        // linkedlist
        b.addFirst(111);// it is method use join first element in array for argument it's use only in
        // linkedlist

        for (int i = 0; i < b.size(); i++) {// travel the array
            System.out.println(b.get(i));
        }

        System.out.println("\n*******************************************\n");

        s.add("ram"); // it below String arraylist
        s.add("navnath");
        s.add("bhushan");
        s.add("uddhav");
        s.add(1, "sita");// it is method use add give index give element
        s.add("navnath");
        System.out.println(s.contains("chand"));// it is method use find give argument in array output in true /false
        System.out.println(s.contains("sita"));// it is method use find give argument in array output in true /false
        System.out.println(s.indexOf("sita"));// it is method use find index of argument like this sita index of 1
        System.out.println(s.lastIndexOf("navnath"));/* it is use method find some element index but some element
         lastindex*/

        // s.clear();// it is method use clear all output element for array
        s.set(4, "bhagat");// it is use method set element specfic index like this work add method
        // s.removeFirst();// it is use remove first element of array
        // s.removeLast();// it is use remove last index od array


        for (int i = 0; i < s.size(); i++) {// travel the array
            System.out.println(s.get(i));
        }
    }
}
