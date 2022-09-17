package ru.mirea.lab2;

public class TestAuthor {
    public static void exec(){
        Author myFirstAuthor = new Author("Pushkin", "WasKilledByDantes@death.gg", 'M');
        System.out.println(myFirstAuthor);
        System.out.println(myFirstAuthor.getName());
        myFirstAuthor.setEmail("MyNameIsAlexDuma@joke.fun");
        System.out.println(myFirstAuthor.getEmail());
        System.out.println(myFirstAuthor.getGender());
    }
}
