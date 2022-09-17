package ru.mirea.lab3.part_1;

public class Square extends Rectangle{
    private double side;

    public Square(){
        this.length = 3;
        this.width = 3;
        this.side = 3;
        this.colour = "white";
        this.filled = false;
    }

    public Square(double side){
        this.length = side;
        this.width = side;
        this.side = side;
        this.colour = "white";
        this.filled = false;
    }

    public Square(double side, String colour, boolean filled){
        this.side = side;
        this.colour = colour;
        this.filled = filled;
        this.length = side;
        this.width = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.side = side;
    }

    @Override
    public String toString() {
        return "Shape: square, " +
                "colour: '" + colour + '\'' +
                ", filled: " + filled +
                ", side: " + side;
    }
}
