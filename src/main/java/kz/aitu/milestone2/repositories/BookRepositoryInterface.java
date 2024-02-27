package kz.aitu.milestone2.repositories;

import kz.aitu.milestone2.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepositoryInterface extends JpaRepository<Book,Integer> {
    List<Book> findByTitle(String title);
}
