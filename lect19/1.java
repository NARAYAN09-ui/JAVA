package lect19;

import java.util.ArrayList;
import java.util.ListIterator;

class one{
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(20);
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(5);
         int s=list.size();
        int m = s/2;
        ListIterator<Integer> it =list.listIterator();
        while (it.hasNext()&&it.nextIndex()<=m) {
        Integer x =it.next();
        }
        while (it.hasNext()) {
            Integer y=it.next();
            System.out.println(y);
        }
    }
}