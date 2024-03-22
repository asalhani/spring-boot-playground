package com.asalhani.springdatapoc.springdatapoc.repositrories;

import com.asalhani.springdatapoc.springdatapoc.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
