package kz.aitu.demo.services;

import kz.aitu.demo.models.User;
import kz.aitu.demo.repositories.UserRepositoryInterface;
import kz.aitu.demo.services.interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService implements UserServiceInterface {

    private final UserRepositoryInterface repo;

    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public User create(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> getBySurname(String surname) {
        return repo.getBySurname(surname);
    }
}