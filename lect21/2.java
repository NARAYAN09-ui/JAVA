package lect21;
class thread2 extends Thread {
public void run(){
    System.out.println(Thread.currentThread().getName());
    for(int i=0;i<12;i++){
        System.out.println("😃 "+i+" : t1");
    }
}
    
}
class two{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        thread2 p=new thread2();
        p.start();
        try {
            p.join();
        } catch (Exception e) {
           
        }
       // p.setName("pushpa"); 
       for(int i=0;i<12;i++){
        System.out.println("🥳 "+i+" : main");
    }
    
    }
}
