package ru.mirea.lab2;

public class TestBall {
    public static void exec(){
        Ball myMovingBall = new Ball(250, 400);
        System.out.println(myMovingBall);
        myMovingBall.move(15.35,14.31);
        System.out.println(myMovingBall);
        System.out.println(myMovingBall.getX());
    }
}
