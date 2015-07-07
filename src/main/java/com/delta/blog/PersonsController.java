package com.delta.blog;
import com.delta.blog.model.Person;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/blogAuthors")
public class PersonsController {


    @RequestMapping(value = "/person/{ceva}", method = RequestMethod.GET)
    public @ResponseBody Person getPersonsInJSON(@PathVariable ("ceva") String Name) {

        Person person1 = new Person();
        person1.setAuthor(Name);
        person1.setBooks("CCCCC");

        return person1;
    }
}

