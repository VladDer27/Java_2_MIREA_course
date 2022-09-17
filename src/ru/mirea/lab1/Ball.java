package ru.mirea.lab1;

public class Ball {
    private int radius;
    private String colour;

    public Ball(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public Ball(int radius){
        this.radius = radius;
        this.colour = "White";
    }

    public Ball(String colour){
        this.radius = 0;
        this.colour = colour;
    }

    public Ball(){
        this.radius = 0;
        this.colour = "White";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void getDiameter(){
        System.out.println("Ball's diameter is: " + radius * 2);
    }

    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }

}
