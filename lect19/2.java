package lect19;
class two {
    public static void main(String[] args) {
        System.out.println("⇩");
        try{
            int a=54;
            int b= 0;
            int c= a/b;
            System.out.println(c); 
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
        System.out.println("⇧");
     }
}
