package cfw;

import java.util.ArrayList;

public class arraylist_02 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(21);
        a.add(31);
        a.add(41);

        for (int e : a) {
            System.out.println(e);
        }

        System.out.println("**********************************");

        ArrayList<String> s = new ArrayList<>();
        s.add("ram");
        s.add("patil");
        s.add("navnath");
        s.add("patil");

        for (String e : s) {
            System.out.println(e);
        }
    }
}
