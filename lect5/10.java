package lect5;

class ten {
    public static void main(String[] args) {
        String str="aab";
        StringBuilder result=new StringBuilder();   
        int count=1;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i<str.length()-1 && ch==str.charAt(i+1)){
               count++;
            }  
            else{
                result.append(ch+""+count);
                count=1 ;
            }
        }
        System.out.println(result);
    }
}
