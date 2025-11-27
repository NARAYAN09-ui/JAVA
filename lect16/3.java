package lect16;
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
}

class Namesort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class three {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("pushpa", 255));
        list.add(new Student("mohit", 195));
        list.add(new Student("sahil", 301));

        Collections.sort(list, new Namesort());

        for (Student s : list) {
            System.out.println(s.name + " " + s.rollnum);
        }
    }
}