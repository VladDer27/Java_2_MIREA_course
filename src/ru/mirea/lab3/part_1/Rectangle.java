package ru.mirea.lab3.part_1;

public class Rectangle  extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.length = 2;
        this.width = 1;
        this.colour = "white";
        this.filled = false;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        this.colour = "white";
        this.filled = false;
    }

    public Rectangle(double width, double length, String colour, boolean filled){
        this.width = width;
        this.colour = colour;
        this.filled = filled;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, " +
                "width: " + width +
                ", length: " + length +
                ", colour: '" + colour + '\'' +
                ", filled: " + filled;
    }
}
