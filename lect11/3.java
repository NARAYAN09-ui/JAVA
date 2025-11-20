
interface animal {
void eat();
}
interface sound {
void dog();
}
class Dog implements animal,sound {
public void eat(){
    System.out.println("eat 🥞");
}
public void dog(){
    System.out.println("dog 🐶");
}
    
}
class main3 {
public static void main(String[] args) {
    Dog d = new Dog();
    d.eat();
    d.dog();
}
}
