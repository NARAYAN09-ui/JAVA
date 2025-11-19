package lect10;
class animal{
void eat(){
    System.out.println("🥬");
}
}
class dog extends animal{
    void eat(){
        System.out.println("🍔");
    }
    void werk(){
        System.out.println("🐶");
    }
}

class one {
    public static void main(String[] args) {
       //animal ss = new dog();
        //ss.eat();
        dog s =new dog();
        s.eat();
        s.werk();
        
    }
}
