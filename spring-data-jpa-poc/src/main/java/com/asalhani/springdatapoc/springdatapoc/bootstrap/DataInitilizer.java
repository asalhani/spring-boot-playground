package com.asalhani.springdatapoc.springdatapoc.bootstrap;

import com.asalhani.springdatapoc.springdatapoc.domain.Book;
import com.asalhani.springdatapoc.springdatapoc.repositrories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitilizer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitilizer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Book book = new Book("book title", "123", "not known..");
        Book savedBook = bookRepository.save(book);

        System.out.println("New Book Id: " + savedBook.getId());

        bookRepository.findAll().forEach(b ->{
            System.out.println(b.toString());
        });
    }
}
