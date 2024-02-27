package kz.aitu.demo.services;

import kz.aitu.demo.models.Book;
import kz.aitu.demo.repositories.BookRepositoryInterface;
import kz.aitu.demo.services.interfaces.BookServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookService implements BookServiceInterface {

    private final BookRepositoryInterface repo;

    public BookService(BookRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Book> getAll() {
        return repo.findAll();
    }

    @Override
    public Book getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Book create(Book book) {
        return repo.save(book);
    }

    @Override
    public List<Book> getByTitle(String title) {
        return repo.getByTitle(title);
    }
}