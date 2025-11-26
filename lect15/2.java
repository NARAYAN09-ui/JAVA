package lect15;

import java.util.HashMap;

class two{
    public static void main(String[] args) {
        HashMap<Character,Integer> hj = new HashMap<>();
    hj.put('a',12);
    hj.put('b', 12);
    hj.put('c', 13);
    System.out.println(hj);
    System.out.println(hj.get('a'));
    System.out.println(hj.get('b'));
    }
}
