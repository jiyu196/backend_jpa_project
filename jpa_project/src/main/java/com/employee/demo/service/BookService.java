package com.employee.demo.service;

import com.employee.demo.entity.Book;
import com.employee.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    // final은 constant(const 임) immutable이라는. 불변.

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {  // 모든 책 조회
        return bookRepository.findAll();
    }

    public Book create(Book book) {  // 책 저장
        return bookRepository.save(book);
    }

    public Book getBookByName(String bookName) {  // 책 단일조회
        return bookRepository.findByBookName(bookName);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
