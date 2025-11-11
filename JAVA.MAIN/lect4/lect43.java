class MyClass {
    public static void main(String[] args) {
    String str="java is powerfull";
    String a[]=str.split(" ");
    String str1="";
       for(String ch: a){
        if(ch.length()>str1.length())
        {
    str1=ch;
     }
    }
    System.out.print(str1);
    }
}
