package lect18;

import java.util.ArrayList;
import java.util.ListIterator;

class six{
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int s=list.size();
        int m = s/2;
        ListIterator<Integer> it =list.listIterator();
        while (it.hasNext()&&it.nextIndex()<=m) {
        Integer x =it.next();
        System.out.println(x);
        }
        while (it.hasPrevious()) {
            Integer y=it.previous();
            System.out.println(y);
        }
    }
    }