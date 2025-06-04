package oops_part1.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void issueBook(String title) {
        Book book = searchBook(title);
        if (book == null) {
            System.out.println("Book not found.");
        } else if (!book.isAvailable()) {
            System.out.println("Book already issued.");
        } else {
            book.setAvailable(false);
            System.out.println("Book issued: " + book.getTitle());
        }
    }

    public void returnBook(String title) {
        Book book = searchBook(title);
        if (book == null) {
            System.out.println("Book not found.");
        } else if (book.isAvailable()) {
            System.out.println("Book was not issued.");
        } else {
            book.setAvailable(true);
            System.out.println("Book returned: " + book.getTitle());
        }
    }

    public void showBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

