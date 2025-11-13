package lect8;
//Class Person has method displayName()
// Class Student inherits Person and adds method displayClass()
//Class Monitor inherits Student and adds method checkDiscipline()
//Create an object of Monitor and call all three methods.
class hello3 {
    public static void main(String[] args) {
        Monitor ob = new Monitor();
        ob.displayName();
        ob.displayClass();
        ob.checkDiscipline();
    }
}
class person {
    void displayName(){
        System.out.println("name: pushpa");
    }
}
class Student extends person{
    void displayClass(){
        System.out.println(" This student is in 12th class");
    }
}
class Monitor extends Student{
    void checkDiscipline(){
        System.out.println("Moniter is check Dicipline");
    }
}
