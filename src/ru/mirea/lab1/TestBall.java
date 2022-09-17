package ru.mirea.lab1;

public class TestBall {
    public static void exec() {
        Ball myFirstBall = new Ball(50, "Red");
        System.out.println(myFirstBall);
        myFirstBall.getDiameter();
        myFirstBall.setColour("Blue");
        myFirstBall.setRadius(45);
        System.out.println(myFirstBall);

        System.out.println();

        Ball mySecondBall = new Ball();
        mySecondBall.setRadius(30);
        mySecondBall.setColour("Orange");
        mySecondBall.getDiameter();
        System.out.println(mySecondBall);
    }
}
