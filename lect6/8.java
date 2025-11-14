//Create a class Student with fields name, rollNumber, and marks. Write a method to display
 //student details. Create 3 student objects and display their data.package lect6;
package lect6;
 class student {
    String name;
    int rollNumber;
    double marks;

    student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

  class Eight{

    public static void main(String[] args) {
        student student1 = new student("pushpa", 101, 85.5);
        student student2 = new student("sahil", 102, 90.0);
        student student3 = new student("Narayan", 103, 78.5);

        student1.display();
        student2.display();
        student3.display();
    }
}
}