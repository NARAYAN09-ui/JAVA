package lect17;

import java.util.HashSet;

class three {
public static void main(String[] args) {
    int a[]={1,2,3,1};
    int a1[]={1,2,3,4};
    HashSet<Integer> set1 =new HashSet<>();
    HashSet<Integer> result=new HashSet<>();
    for(int x : a){
        set1.add(x);
    }
     for(int y : a1){
        if(set1.contains(y)){
            result.add(y);
        }
     }
        System.out.println(result);
}
    
}