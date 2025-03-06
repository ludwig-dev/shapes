package org.example;

public class ShapeApp {
    public static void main(String[] args) {
        Shape circle = new Circle("Green", 5.0);
        circle.draw();
        System.out.println(circle + "\n");

        Shape rectangle = new Rectangle("Blue", 3.0, 5.0);
        rectangle.draw();
        System.out.println(rectangle);

        Shape sqaure = new Square("Red", 4.0);
        sqaure.draw();
        System.out.println(sqaure);
    }
}
