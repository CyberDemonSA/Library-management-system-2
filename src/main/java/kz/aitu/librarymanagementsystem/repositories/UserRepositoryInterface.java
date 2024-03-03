package kz.aitu.librarymanagementsystem.repositories;

import kz.aitu.librarymanagementsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepositoryInterface extends JpaRepository<User, Integer> {
    List<User> findBySurname(String surname);
}