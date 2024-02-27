package kz.aitu.milestone2.repositories;

import kz.aitu.milestone2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepositoryInterface extends JpaRepository<User,Integer> {
    List<User> findBysurname(String username);


}
