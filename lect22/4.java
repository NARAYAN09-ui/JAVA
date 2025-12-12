package lect22;
import java.util.ArrayList;
import java.util.List;

class four {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
     List<Integer> res=   list.stream().map(n->n*2).toList();
     System.out.println(res);
    }
}

