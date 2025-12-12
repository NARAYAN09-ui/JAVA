package lect22;

import java.util.ArrayList;
import java.util.List;

class six {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(31);
        list.add(45);
        list.add(51);
        list.add(6);
        list.add(211);
    List<Integer> redu=  list.stream().filter(n->n>5).toList();
    List<Integer> redu1=redu.stream().filter(n->n%2==1).toList();
   int res=   redu1.stream().reduce(0,(a,b)->a+b);
    System.out.println(redu+" <- greater then 5");
     System.out.println(redu1+"<- odd n.");  
   System.out.println(res+"<- sum");
    
    }
}


