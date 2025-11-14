package lect5;
class nine {
    public static void main(String[] args) {
        String str = new String("i love java");
        String a[]=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String el : a){
            StringBuilder va =new StringBuilder(el);
            result.append(va.reverse()).append(" ");
        }
        System.out.println(result);
    }
}
