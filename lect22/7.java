package lect22;

import java.util.ArrayList;
import java.util.List;

class seven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(31);
        list.add(5);
        list.add(51);
        list.add(6);
        list.add(211);
//     

   List<Integer> skip=  list.stream().skip(5).toList();
   List<Integer> limit=  list.stream().limit(51).toList();
List<Integer> sort=  list.stream().sorted().toList();
System.out.println(skip+" <- 1");
System.out.println(limit+" <- 2");
System.out.println(sort+" <- 3");


//     System.out.println(redu+" <- greater then 5");
//      System.out.println(redu1+"<- odd n.");  
//    System.out.println(res+"<- sum");
    
    }
}