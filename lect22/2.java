package lect22;
class mythread2 implements Runnable{
  public void run(){
     for(int i =0;i<4;i++){
       System.out.println("🚩jai shree ram  "+i);
        }
        try {
            Thread.sleep(100);
    } catch (Exception e) {
      System.out.println(e); 
    }
  }  
}
class two {
    public static void main(String[] args) {
        
    
    mythread2 task =new mythread2();
    Thread t1 =new Thread(task);
    Thread t2 =new Thread(task);
    t1.start();
    t2.start();
}
}