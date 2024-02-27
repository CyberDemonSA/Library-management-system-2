package kz.aitu.milestone2.services.interfaces;

import kz.aitu.milestone2.models.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAll();
    User getById(int Id);
    User create (User user);
    List<User> getBySurname(String surname);
}
