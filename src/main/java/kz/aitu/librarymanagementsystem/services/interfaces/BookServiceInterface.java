package kz.aitu.librarymanagementsystem.services.interfaces;

import kz.aitu.librarymanagementsystem.models.Book;

import java.util.List;

public interface BookServiceInterface {
    List<Book> getAll();
    Book getById(int id);
    Book create(Book book);
    List<Book> getByTitle(String title);
}
