import java.util.Arrays;

class yclass{
    public static void main(String[] args) {
        String str="hello";
        String str1="olleh";
      char ch[]=str.toCharArray();
      char ch1[]=str1.toCharArray();
      Arrays.sort(ch);
      Arrays.sort(ch1);  
      String vall=new String(ch);
      String vall1=new String(ch1); 
      if(vall.equals(vall1)){
        System.out.println(true);
      }
      else {
        System.out.print(false);
      }
    }
 
}
