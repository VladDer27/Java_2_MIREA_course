package ru.mirea.lab1;

public class Book {
    private String name;
    private int numberOfPapers;

    public Book(String name, int numberOfPapers) {
        this.name = name;
        this.numberOfPapers = numberOfPapers;
    }

    public Book(String name){
        this.name = name;
        this.numberOfPapers = 0;
    }

    public Book(int numberOfPapers){
        this.name = "This book hasn't got a name";
        this.numberOfPapers = numberOfPapers;
    }

    public Book(){
        this.name = "This book hasn't got a name";
        this.numberOfPapers = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPapers() {
        return numberOfPapers;
    }

    public void setNumberOfPapers(int numberOfPapers) {
        this.numberOfPapers = numberOfPapers;
    }

    public String toString() {
        return "Book: " +
                "name='" + name + '\'' +
                ", numberOfPapers=" + numberOfPapers;
    }
}
