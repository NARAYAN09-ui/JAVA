package lect18;

import java.util.ArrayList;
import java.util.Iterator;

class one{
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        Iterator<Integer> it =list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
