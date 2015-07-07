package com.delta.blog.repository;

import com.delta.blog.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Razvan on 07-Jul-15.
 */
@Component("bookDaoFromMemory")
public class BookDaoFromMemory implements BookDao {

    List<Book> booksList = new ArrayList<Book>() {{
        Book defaultBook = new Book("ISBDN-001");
        defaultBook.setResume("whatever");
        defaultBook.addAuthor("Miki");
        add(defaultBook);
    }};


    public Book findByIsbdn(String isbdn) {
        for (Book book : booksList) {
            if (book.getIsbdn().equalsIgnoreCase(isbdn)) {
                return book;
            }
        }

        return null;
    }

    public List<Book> findAll() {
        return this.booksList;
    }

    public Boolean save(Book book) {
        if (booksList.contains(book)) {
            return false;
        } else {
            this.booksList.add(book);
            return true;
        }
    }
}
