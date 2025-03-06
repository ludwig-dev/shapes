package org.example;

public class Square extends Shape {
    private double lenght;

    public Square(String color, double lenght) {
        super(color);
        this.lenght = lenght;
    }

    @Override
    public double area() {
        return lenght * lenght;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " Square of size " + lenght);
    }
}
