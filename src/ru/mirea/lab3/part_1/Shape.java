package ru.mirea.lab3.part_1;

public abstract class Shape {
    protected String colour;
    protected boolean filled;

    public Shape(){
        this.filled = false;
        this.colour = "white";
    };

    public Shape(String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
