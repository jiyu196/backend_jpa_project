package com.employee.demo.repository;

import com.employee.demo.entity.Book;
import com.employee.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
    Book findByBookName(String bookName);
}
