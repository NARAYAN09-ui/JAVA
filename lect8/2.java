package lect8;

class two {
    public static void main(String[] args) {
    brand ob=new brand();
    ob.color();
    ob.model();
    }
}
class car {
    void color(){
        System.out.println("car color is black");
    }
}
class brand extends car{
void model(){
    System.out.println("BMW z4");
}
}