package kz.aitu.demo.services.interfaces;

import kz.aitu.demo.models.Book;

import java.util.List;

public interface BookServiceInterface {
    List<Book> getAll();
    Book getById(int id);
    Book create(Book book);
    List<Book> getByTitle(String title);
}
