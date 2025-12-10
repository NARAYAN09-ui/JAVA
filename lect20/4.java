package lect20;

import java.io.*;
class four{
    public static void main(String[] args) {
       //insertdata();
      // readFile();
      deletefile();
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
    // static void insertdata(){
    //     try {
        
    //      FileWriter writer=new FileWriter("two.java",true);
    //      writer.write(":-  😃 radhe radhe");
    // //    FileWriter writer=new FileWriter("two.java");
    // //     writer.write(":-  😃 new ");
    //     writer.close();
    //     } catch (Exception e) {
    //         System.out.println(e);
   //     }
    // }
   static void deletefile(){
    try {
        File file= new File("abc/two.java");
        if (file.delete()) {
            System.out.println("del");
         } //else {
        //     System.out.println("not");
        // }
        
    } catch (Exception e) {
       System.out.println(e);
    }
   }
    
}
