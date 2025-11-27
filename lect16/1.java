package lect16;

import java.util.ArrayList;
import java.util.Collections;

class One {
    public static void main(String[] args) {
        ArrayList<Integer> hi= new ArrayList<>();
        hi.add(5);
        hi.add(2);
        hi.add(1);
        hi.add(0);
        System.out.println(hi);
        Collections.sort(hi);
        System.out.println(hi);
    }
}