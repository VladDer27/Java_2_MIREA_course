package ru.mirea.lab3.part_2;

public class Test {
    public static void exec(){
        MovablePoint myFirstPoint = new MovablePoint(5, -8, 10, 20);
        System.out.println(myFirstPoint);
        myFirstPoint.moveUp();
        myFirstPoint.moveLeft();
        System.out.println(myFirstPoint);

        MovableCircle myFirstCircle = new MovableCircle(5, -8, 10, 20, 100);
        System.out.println(myFirstCircle);
        myFirstCircle.moveLeft();
        myFirstCircle.moveDown();
        System.out.println(myFirstCircle);

        MovableRectangle myFirstRectangle = new MovableRectangle(0,5,5,0,10,20, 10, 20);
        System.out.println(myFirstRectangle);
        myFirstRectangle.moveUp();
        myFirstRectangle.moveRight();
        System.out.println(myFirstRectangle);
    }
}
