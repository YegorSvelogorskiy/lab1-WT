package by.bsuir.stephanovich.task15;

import by.bsuir.stephanovich.task12.Book;

import java.util.Comparator;

public class BookAuthorThenTitleComparator implements Comparator<Book>{
    @Override
    public int compare(Book b1, Book b2) {
        Comparator<Book> cmp = new BookAuthorComparator().thenComparing(new BookTitleComparator());
        return cmp.compare(b1, b2);
    }
}
