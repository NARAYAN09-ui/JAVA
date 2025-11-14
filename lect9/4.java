//Overload a method calculateArea for calculating the area of a circle (use radius as the argument),
// rectangle (use length and width), and triangle (use base and height).

class four  {
    public static void main(String[] args) {
        initArea ob = new initArea();
        ob.calculateArea(7.5); 
        ob.circle(5.0, 10.0); 
        ob.triangle(6.0, 8.0); 
    }
}
class initArea {
    void calculateArea(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    void circle(double length, double width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    void triangle(double base, double height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }   

}