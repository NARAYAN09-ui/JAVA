package lect21;

class thread3 extends Thread {
public void run(){
      System.out.println(Thread.currentThread().getName());
     for(int i=0;i<12;i++){
        System.out.println("dowloding............"+i*20);
                        try {
                            Thread.sleep(2000);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
   }
}
    
}
class three{
    public static void main(String[] args) {
       System.out.println(Thread.currentThread().getName());
         thread3 p3=new thread3();
         p3.start();
    //     try {
    //         p.join();
    //     } catch (Exception e) {
           
    //     }
    
    }
}