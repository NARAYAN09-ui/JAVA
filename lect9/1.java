package lect9;

class one {
    public static void main(String[] args) {
        init ob =new init();
        ob.sum();
        ob.sum(5);
        ob.sum(5, 9);
    }
}
class init{
    void sum (){
        System.out.println("hello");
    }
    void sum (int a){
        System.out.println(a);
    }
    void sum (int a,int b){
System.out.println(a);
System.out.println(b);
    }
}
