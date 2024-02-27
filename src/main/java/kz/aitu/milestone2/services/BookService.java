package kz.aitu.milestone2.services;

import kz.aitu.milestone2.models.Book;
import kz.aitu.milestone2.models.User;
import kz.aitu.milestone2.repositories.BookRepositoryInterface;
import kz.aitu.milestone2.services.interfaces.BookServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    @AllArgsConstructor
    public class BookService {

        private BookRepositoryInterface bookRepository;

        public List<Book> getAllBooks() {
            return bookRepository.findAll();
        }
}
