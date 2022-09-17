package ru.mirea.lab3.part_2;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed1, int ySpeed1, int xSpeed2, int ySpeed2){
        topLeft = new MovablePoint(x1,y1,xSpeed1,ySpeed1);
        bottomRight = new MovablePoint(x2,y2,xSpeed2,ySpeed2);
    }

    public boolean isSpeedXEqual(){
        return (topLeft.xSpeed == bottomRight.xSpeed);
    }

    public boolean isSpeedYEqual(){
        return (topLeft.ySpeed == bottomRight.ySpeed);
    }

    @Override
    public void moveDown() {
        if(isSpeedYEqual()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveUp() {
        if(isSpeedYEqual()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveLeft() {
        if(isSpeedXEqual()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if(isSpeedXEqual()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "Top left point: " + topLeft.toString() +
                ", Bottom right point: " + bottomRight.toString();
    }
}
