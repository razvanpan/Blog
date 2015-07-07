package com.delta.blog.repository;

import com.delta.blog.model.Book;

import java.util.List;

/**
 * Created by Razvan on 07-Jul-15.
 */
public interface BookDao {

    Book findByIsbdn(String isbdn);

    List<Book> findAll();

    Boolean save(Book book);
}
