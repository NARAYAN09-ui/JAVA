package lect11;
interface vehicle {
void brand ();
default void wheel(){ 
System.out.println("Car has four wheels 🛞");
}
interface car { 
void model();
}
class show implements vehicle,car{
    public void brand(){
        System.out.println("bayerische motoren werke 🚙 ");
    }
    public void model(){
        System.out.println("z4 m40i🚄  ");
    }
}
    
}
class main4 {
    public static void main(String[] args) {
        vehicle d = new vehicle.show();
        vehicle.car s = new vehicle.show();
        d.wheel();
        d.brand();
        s.model();
    }
    
}
