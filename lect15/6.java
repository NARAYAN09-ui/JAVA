package lect15;

import java.util.HashMap;

class six {
    public static void main(String[] args) {
        HashMap<Character,Integer> hj =new HashMap<>();
     String a ="hhggffddssaaeerwhhgfsafhfgu";
        for(char x :a.toCharArray()){
          hj.put(x, hj.getOrDefault(x, 0) + 1);
        }
    System.out.println(hj);
    for(char x : a.toCharArray()){
     if(hj.get(x)==1){
       System.out.println(x);
      break;
     }
   }
}
}