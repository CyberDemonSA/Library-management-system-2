package kz.aitu.librarymanagementsystem.services.interfaces;

import kz.aitu.librarymanagementsystem.models.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAll();
    User getById(int id);
    User create(User user);
    List<User> getBySurname(String surname);
}