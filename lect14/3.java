package lect14;
import java.util.*;
class three {
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(11);
        list.add(13);
        list.set(1,12);
        list1.add(14);
        list1.add(15);
        System.out.println(list);
        list.addAll(list1);
        System.out.println(list);   
}
};