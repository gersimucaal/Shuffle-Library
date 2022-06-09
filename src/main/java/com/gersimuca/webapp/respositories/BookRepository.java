package com.gersimuca.webapp.respositories;

import com.gersimuca.webapp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {



}
