package kz.aitu.demo.repositories;

import kz.aitu.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepositoryInterface extends JpaRepository<User, Integer> {
    List<User> getBySurname(String surname);
}