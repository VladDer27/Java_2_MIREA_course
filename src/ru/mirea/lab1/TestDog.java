package ru.mirea.lab1;

public class TestDog {
    public static void exec() {
        Dog myFirstDog = new Dog("Odri", 5);
        System.out.println(myFirstDog);
        myFirstDog.intoHumanAge();
        myFirstDog.setAge(8);
        System.out.println(myFirstDog);
        myFirstDog.intoHumanAge();

        Dog mySecondDog = new Dog("Nordic", 4);
        System.out.println(mySecondDog);
        System.out.println(myFirstDog.getAge());
    }
}
