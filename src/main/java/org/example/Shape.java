package org.example;

public abstract class Shape implements Drawable {
    protected String color;

    public Shape(String color){
        this.color = color;
    }

    public abstract double area();

    @Override
    public String toString(){
        return "Color: " + this.color + ", Area: " + area();
    }
}
