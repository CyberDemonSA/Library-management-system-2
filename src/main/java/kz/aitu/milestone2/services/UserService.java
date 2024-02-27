package kz.aitu.milestone2.services;

import kz.aitu.milestone2.models.User;
import kz.aitu.milestone2.repositories.UserRepositoryInterface;
import kz.aitu.milestone2.services.interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class  UserService implements UserServiceInterface {
private final UserRepositoryInterface repo;

    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User getById(int Id) {
        return repo.findById(Id).orElse(null);
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public List<User> getBySurname(String surname) {
        return null;
    }
}
