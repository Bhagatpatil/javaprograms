package cfw;

import java.util.HashSet;

public class hashset_01 {
    public static void main(String[] args) {

        HashSet<Integer> s = new HashSet<>();
        s.add(23);
        s.add(54);
        s.add(56);
        s.add(76);

        //s.clear();

        System.out.println(s);
    }
}
