package org.example;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Green", 5.0);
        circle.draw();
        System.out.println(circle.toString() + "\n");

        Shape rectangle = new Rectangle("Blue", 3.0, 5.0);
        rectangle.draw();
        System.out.println(rectangle.toString());
    }
}