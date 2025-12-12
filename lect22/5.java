package lect22;

import java.util.ArrayList;

class five {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(210);
   int res=   list.stream().reduce(0,(a,b)->a+b);
     System.out.println(res);
    }
}

