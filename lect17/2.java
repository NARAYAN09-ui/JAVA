package lect17;

import java.util.HashSet;

class two {
    public static void main(String[] args) {
      int a[]={1,2,3,1};
     HashSet<Integer> set = new HashSet<>();
     for(int x:a){
       if(set.contains(x)){
       System.out.println(true);
         return;
       }
    
       set.add(x);}
       System.out.println(false);

    }
}

