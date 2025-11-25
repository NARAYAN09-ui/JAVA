package lect14;
import java.util.ArrayList;

class six {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        boolean ans = list.contains(14);
        int index = list.indexOf(100);
        int index1 = list.lastIndexOf(100);
        System.out.println(index);
        System.out.println(index1);
        System.out.println(ans);

    }
}

