package lect16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int rollnum;
    public Student(String name, int rollnum) {
        this.name = name;
        this.rollnum = rollnum;
    }
    public int comparato(Student s){
        return this.rollnum-s.rollnum;
    }
    public String toString(){
        return rollnum+" "+name;
    }
}

class two {
    public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();
    list.add(new Student("pushpa", 255));
   list.add(new Student("mohit", 195));
   list.add(new Student("sahil", 301));
    Collections.sort(list, new Comparator<Student>() {
         public int compare(Student s1, Student s2){
              return s1.rollnum - s2.rollnum;
         }        
    });
    System.out.println(list);   
}}

