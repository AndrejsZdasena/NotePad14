package com.company;


import java.io.PrintWriter;
import java.util.Scanner;

public class Book extends Record {

    private String title;
    private String author;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        System.out.println("BOOK.toString() started");

        String str = super.toString();
        return String.format("%s; title %s; author: %s; isbn: %s", str, title, author, isbn);
    }

    @Override
    public void askData() {
        System.out.println("BOOK.askData() started");

        title = InputUtils.askString("Enter title");
        author = InputUtils.askString("Enter author");
        isbn = InputUtils.askString("Enter isbn");
    }


    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || title.contains(substr)
                || author.contains(substr)
                || isbn.contains(substr);
    }

    @Override
    public void load(Scanner in) {
        super.load(in);
        title = in.nextLine();
        author = in.nextLine();
        isbn = in.nextLine();
    }

    @Override
    public RecordType getMyType() {
        return RecordType.BOOK;
    }

    public void printToFile(PrintWriter out) {
        super.printToFile(out);
        out.print(title);
        out.print(author);
        out.print(isbn);
    }
}
