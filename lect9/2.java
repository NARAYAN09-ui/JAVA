//Create a class with multiple sum methods where one takes two integers, 
//another takes three integers, and another takes two double values. 
//All methods should print the sum of the arguments passed.


package lect9;

class two {
    public static void main(String[] args) {
       init ob = new init();
       ob.sum(5,8) ;
       ob.sum(5,10,15);
       ob.sum(4.5, 3.2);
    }
}
class init {
void sum(int a, int b){
    System.out.println(a+b);
}
void sum(int a, int b, int c){
    System.out.println(a+b+c);
}
void sum(double a, double b){
    System.out.println(a+b);
}
}