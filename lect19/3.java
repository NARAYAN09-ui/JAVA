package lect19;

import java.util.Scanner;

class three{
    public static void main(String[] args) {
        System.out.println("☟⇲");
        try{
            System.out.println("Enter 5 numbers:");
            int a[]=new int[5];
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<5;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter index to get its data :");
            int n = sc.nextInt();
            System.out.println(a[n]);


        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("☝︎⇱");
     }


}
