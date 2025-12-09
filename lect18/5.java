package lect18;

import java.util.ArrayList;
import java.util.ListIterator;

class five{
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
        ListIterator<Integer> it =list.listIterator();
        for(int i=0;i<=s/2;i++){
            Integer x =it.next();
            System.out.println(x);
        }
        for(int i=s/2;i>=0;i--){
            Integer x =it.previous();
            System.out.println(x);
        }
    }
    }
