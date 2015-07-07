package com.delta.blog.rest;

import com.delta.blog.model.Book;
import com.delta.blog.repository.BookDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Razvan on 07-Jul-15.
 */
@Controller
@RequestMapping("/books")
public class BookRestAPI {

    @Resource(name = "bookDaoFromMemory")
    BookDao bookDao;

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<Book> getAll() {
        return bookDao.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public
    @ResponseBody
    Boolean addBook(@RequestBody Book book) {
        return bookDao.save(book);
    }

}
