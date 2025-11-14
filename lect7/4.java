//Create a class Car with fields brand, model, and price. Write a method to display car details.
//Create multiple objects and display info.
package lect7;
class four {
    public static void main(String[] args) {
     car  c1=new car("bmw" ,"z4",9200000);
     c1.display();
    }
}

class car{
    String brand;
    String model;
    int price;
    car(String brand, String model, int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    void display(){
        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("price: "+price);
    }
}
