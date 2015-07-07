package com.delta.blog.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Razvan on 07-Jul-15.
 */
public class Book implements Serializable {

    private List<String> authorsList = new ArrayList<String>();

    private String isbdn;

    private String resume;

    public Book() {
    }

    public Book(String isbdn) {
        this.isbdn = isbdn;
    }

    public void addAuthor(String author) {
        this.authorsList.add(author);
    }

    public List<String> getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(List<String> authorsList) {
        this.authorsList = authorsList;
    }

    public String getIsbdn() {
        return isbdn;
    }

    public void setIsbdn(String isbdn) {
        this.isbdn = isbdn;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return isbdn.equals(book.isbdn);

    }

    @Override
    public int hashCode() {
        return isbdn.hashCode();
    }
}
