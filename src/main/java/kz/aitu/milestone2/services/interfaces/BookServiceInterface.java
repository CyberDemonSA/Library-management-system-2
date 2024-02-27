package kz.aitu.milestone2.services.interfaces;

import kz.aitu.milestone2.models.Book;
import kz.aitu.milestone2.models.User;

import java.util.List;

public interface BookServiceInterface {
    List<Book> getAllBooks();
    User getByIdBook(int Id);
    User create (Book book);
    List<User> getByTitle(String title);
}
