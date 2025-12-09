package lect19;

class four{
 public static void main(String[] args) {
   try {
    voteage(16);
   } catch (Exception e) {
    System.out.println(e);
   } 
   try {
    voteage(20);
   } catch (Exception e) {
    System.out.println(e);
   }
 }  
static void voteage(int age){
System.out.println("check of vote");
if(age<18){
throw new IllegalArgumentException("Not valid for voting");
}
else{
    System.out.println("valid for voting");
}
 } 
}
