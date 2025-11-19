// Create an abstract class 'Shape' with an abstract method 'area()'. Implement two subclasses
//'Circle' and 'Rectangle'
package lect10;
abstract class Shape {
    abstract void area();

    class Circle extends Shape {
        @Override
        void area() {
            System.out.println("Calculating area of circle");
        }
    }

    class Rectangle extends Shape {
        @Override
        void area() {
            System.out.println("Calculating area of rectangle");
        }
    }   
}
class main {
    public static void main(String[] args) {
        Shape.Circle circle = new Shape().new Circle();
        circle.area();

        Shape.Rectangle rectangle = new Shape().new Rectangle();
        rectangle.area();
    }
}
