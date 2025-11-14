

class three {
    public static void main(String[] args) {
        init ob = new init();
        ob.area(5); 
        ob.area(5, 10); 
        ob.area(7.5); 
    }
}
class init {
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}
