package kz.aitu.demo.repositories;

import kz.aitu.demo.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepositoryInterface extends JpaRepository<Book, Integer> {
    List<Book> getByTitle(String title);
}
