package lect5;

class eleven {
    public static void main(String[] args) {
       StringBuilder str =new StringBuilder("aggja");
       StringBuilder str1 =str.reverse();
       if(str.equals(str1)){
        System.out.println("palindrom");
       }
       else{
        System.out.println("not a palindrom");
       }
    }
}
        
            