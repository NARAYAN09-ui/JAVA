package lect20;

import java.io.*;
class one  {
    public static void main(String[] args) {
       insertdata();
       //readFile();
        try {
            File file=new File("two.java");

            if(file.createNewFile()){
                System.out.println("done👍 "+file.getName());
            }
            else{
                System.out.println("alerady file exiest");
            }
        } catch (Exception e) {
           System.out.println(e);
   }
}
    static void insertdata(){
        try {
        
         FileWriter writer=new FileWriter("two.java",true);
         writer.write(":-  😃 radhe radhe");
    //    FileWriter writer=new FileWriter("two.java");
    //    writer.write(":-  😃 new ");
        writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // static void readFile(){
    //     try {
    //         FileReader reader = new FileReader("two.java");
    //        int ch;
    //        while ((ch=reader.read())!=-1) {
    //         System.out.print((char)ch);
    //        }
        
    //     } catch (Exception e) {
    //         System.out.println(e);
    //     }
    // }
}
