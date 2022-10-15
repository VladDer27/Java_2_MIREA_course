package ru.mirea.lab10;

public class Client {

    IChair chair;

    void sit() {
        System.out.println("Have a sit?");
    }

    public void setChair(IChair chair) {
        this.chair = chair;
    }
}
