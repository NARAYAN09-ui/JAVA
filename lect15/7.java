package lect15;

import java.util.HashMap;

class seven{
public static void main(String[] args) {
    int a[]={2,7,5,4};
    HashMap<Integer,Integer> hj=new HashMap<>();
    int terget =9;
    for(int i=0; i<a.length;i++){
        int diff= terget - a[i];
        if(hj.containsKey(diff)){
      System.out.println(hj.get(diff)+" "+i);
      break;
        }
        hj.put(a[i], i);    
}
}
}