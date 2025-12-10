package lect20;

import java.io.*;
class three {
    public static void main(String[] args) {
       //insertdata();
//         try {
//             File file=new File("two.java");

//             if(file.createNewFile()){
//                 System.out.println("done👍 "+file.getName());
//             }
//             else{
//                 System.out.println("alerady file exiest");
//             }
//         } catch (Exception e) {
//            System.out.println(e);
//    }
}
    static void insertdata(){
        try {
        
         FileWriter writer=new FileWriter("two.java",true);
         writer.write(":-  😃 radhe radhe");
         writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    }

