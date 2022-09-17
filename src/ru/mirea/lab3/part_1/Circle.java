package ru.mirea.lab3.part_1;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
        this.filled = false;
        this.colour = "white";
        this.radius = 1;
    };

    public Circle(double radius){
        this.radius = radius;
        this.colour = "white";
        this.filled = false;
    }

    public Circle(double radius, String colour, boolean filled){
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, " +
                "radius: " + radius +
                ", colour: '" + colour + '\'' +
                ", filled: " + filled +
                ';';
    }
}
