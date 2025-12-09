package lect18;

import java.util.ArrayList;
import java.util.Iterator;

class two{
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
        Iterator<Integer> it =list.iterator();
        while (it.hasNext()) {
            if(it.next()==12){
        it.remove();
             }
           Integer u= it.next();
            System.out.println(u);
        }
        //System.out.println(list);
    }
}