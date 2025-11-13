package lect8;
//Class Shape has method draw()
//Class Circle inherits Shape and has method calculateArea()
//Create an object of Circle and call both methods.
class hello4{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.calculateArea();
    }
}
class Shape{
    void draw(){
        System.out.println("drawing shape");
    }   
}
class Circle extends Shape{
    void calculateArea(){
        System.out.println("calculating area of circle");
    }   
}