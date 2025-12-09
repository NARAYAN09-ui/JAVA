package lect19;

class six{
    public static void main(String[] args) {
        try {
            riskymethod();
        } catch (Exception e) {
           System.out.println("main me");
        }
        System.out.println("program .......");
    }
    static void riskymethod()throws ArithmeticException{
     System.out.println("start");
     int result = 10/0;
     System.out.println(result);
     System.out.println("end");
    }
}
