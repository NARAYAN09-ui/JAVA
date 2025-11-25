package lect14;
 
 import java.util.*;
    class ten {
        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(13);
            list.add(11);
            list.add(12);
            list.add(14);
            list.add(15);
            System.out.println(list);
            list.removeFirst();
            list.removeLast();
            System.out.println("removing first and last");
            for (int num : list ) {
                System.out.println(num);
            }
            list.addFirst(9);
            list.addLast(16);
            System.out.println("9 at first and 16 at last");
            for (int num : list ) {
                System.out.println(num);
            }   
            list.add(2, 10);
            System.out.println("10 at index 2");
            for (int num : list ) {
                System.out.println(num);
            }
            list.remove(3);
            System.out.println("removing index 3");
            for (int num : list ) {
                System.out.println(num);
            }
        }
    } 
    