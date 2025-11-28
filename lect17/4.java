package lect17;

import java.util.HashSet;

class four{
public static void main(String[] args) {
    

int a[] = {1,5,0,6,7};

        HashSet<Integer> set = new HashSet<>();
        int k=3;
        for(int  i=0;i< k;i++) {
            set.add(a[i]);
        }
        if(set.size()==k)
                System.out.println("duplicate element not exist");
        else
            System.out.println("duplicate element exist");
    }
}