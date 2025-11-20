package lect11;
interface eat{
void food();
}
class human implements eat{
   public void food(){
System.out.println("human eat food for enagy");
    }
}
class main2 {
    public static void main(String[] args) {
    human H=new human();
    H.food();
    }
}
