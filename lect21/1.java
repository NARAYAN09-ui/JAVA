package lect21;
class thread extends Thread {
public void run(){
    System.out.println(Thread.currentThread().getName());
    for(int i=0;i<12;i++){
        System.out.println("😃 "+i+" : t1");
    }
}
    
}
class one{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        thread p=new thread();
        p.start();
        p.setName("pushpa");
     for(int i=0;i<12;i++){
        System.out.println("🥳 "+i+" : t2");
    }
    }
}
