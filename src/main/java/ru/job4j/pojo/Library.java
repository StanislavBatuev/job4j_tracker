package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book onTheOtherSideOfTheStyx = new Book("On the other side of the Styx", 300);
        Book cleanCode = new Book("Clean Code", 175);
        Book howToWriteABook = new Book("How to write a book", 275);
        Book viking = new Book("Viking", 288);
        Book[] books = new Book[4];
        books[0] = onTheOtherSideOfTheStyx;
        books[1] = cleanCode;
        books[2] = howToWriteABook;
        books[3] = viking;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getBook() + " " + book.getPages());
        }
        Book temp = null;
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getBook() + " " + book.getPages());
        }
    }
}