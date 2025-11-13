package lect8;

class one {
   public static void main(String[] args) {
    new hello();
   } 
}
class hello{
    hello(){
        
        System.out.println("hello");
        this(9);
    }
    hello(int a){
    
        System.out.println(a);
         this(8,7);
    }
    hello(int a,int b){
        System.out.println(a);
        System.out.println(b);
        this(6,5,4);
    }
    hello(int a,int b,int c){
      System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        this(3,2,1,0);
    }
     hello(int a,int b,int c,int d){
      System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
}
}