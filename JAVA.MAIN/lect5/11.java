package lect5;

class eleven {
    public static void main(String[] args) {
       StringBuilder str =new StringBuilder("ada");
       StringBuilder set = new StringBuilder(str.reverse());
       if(str.equals(set)){
        System.out.println("palindrom");
       }
       else{
        System.out.println("not a palindrom");
       }
    }
}
        
            