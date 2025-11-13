package lect8;

class three{
    public static void main(String[] args) {
    expenses ob=new expenses();
    ob.color();
    ob.model();
    ob.price();
    }
}
class car {
    void color(){
        System.out.println("car color is black");
    }
}
class brand extends car{
void model(){
    System.out.println("BMW z4");
}
}
class expenses extends brand{
void price(){
    System.out.println("car price is 920k");
}
    
}