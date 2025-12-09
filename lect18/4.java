package lect18;

import java.util.ArrayList;
import java.util.ListIterator;

class four{
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
         while (it.hasNext()) {
            Integer x= it.next();
            if(x==12){
             it.set(10);
            }
        }
          System.out.println(list);
    }
}

