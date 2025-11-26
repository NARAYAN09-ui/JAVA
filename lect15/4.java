package lect15;

import java.util.*;

class four{
    public static void main(String[] args) {
        HashMap<Character,Integer> hj = new HashMap<>();
    hj.put('a',12);
    hj.put('b', 12);
    hj.put('c', 13);
    System.out.println(hj);
    System.out.println(hj.getOrDefault('p', 11));
    System.out.println(hj.getOrDefault('d', 19));
    for(char x : hj.keySet()){    
         System.out.println(x);
    }
    }
}
