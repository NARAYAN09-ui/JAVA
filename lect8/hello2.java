package lect8;
// Class Employee has method work()
//Class Manager inherits Employee and has method attendMeeting()
// Create an object of Manager and call both methods.
class hello2  {
    public static void main(String[] args) {
       Manager ob=new Manager();
       ob.work();
       ob.attendMeeting(); 
    }
}
class Employee{
void work(){
    System.out.println("Employee are working hard");
}
}
class Manager extends Employee{
    void attendMeeting (){
        System.out.println("Manager is attendmeeting and discuse about futur project ");
    }
}