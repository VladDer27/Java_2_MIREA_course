package ru.mirea.lab1;

public class TestBook {
    public static void exec(){
        Book myFirstBook = new Book("Harry Potter", 650);
        System.out.println(myFirstBook);

        Book mySecondBook = new Book("Twilight: part 1", 386);
        System.out.println(mySecondBook);
        mySecondBook.setNumberOfPapers(340);
        mySecondBook.setName("Twilight: part 2");
        System.out.println(mySecondBook.getNumberOfPapers());
        System.out.println(mySecondBook);
    }
}
