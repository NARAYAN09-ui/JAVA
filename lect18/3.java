package lect18;

import java.util.ArrayList;
import java.util.ListIterator;

class three{
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        ListIterator<Integer> it =list.listIterator();
        System.out.println("👍");
         while (it.hasNext()) {
            Integer x= it.next();
             System.out.println(x);
        }
     //  System.out.println(list);
      System.out.println("👎");
        while (it.hasPrevious()) {
            Integer u= it.previous();
             System.out.println(u);
        }
      // System.out.println(list);
    }
}
