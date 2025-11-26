package lect15;

import java.util.HashMap;

class five {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hj =new HashMap<>();
        int a[]= {1,2,3,4,5,4,2,3,1,2};
        for(int x : a){
          hj.put(x, hj.getOrDefault(x, 0) + 1);
        }
        System.out.println(hj);
    }
}
