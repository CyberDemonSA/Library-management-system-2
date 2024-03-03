package kz.aitu.librarymanagementsystem.repositories;

import kz.aitu.librarymanagementsystem.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepositoryInterface extends JpaRepository<Book, Integer> {
    List<Book> findByTitle(String title);
}
