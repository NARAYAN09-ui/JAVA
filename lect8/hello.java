package lect8;

class Vehicle{
   void wheel(){
    System.out.println("vehicle has four wheel");
   } 
}
class car extends Vehicle{
    void seat(){
        System.out.println("there is 5 sheat in this car ");
    }
}
class bus extends Vehicle{
    void lenth(){
        System.out.println("this bus has 11meter lenth");
    }
}
class hello {
   public static void main(String[] args) {
    car ob1=new car();
    ob1.seat();
    bus ob2=new bus();
    ob2.lenth();
   } 
}
