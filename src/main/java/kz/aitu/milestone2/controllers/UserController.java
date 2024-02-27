package kz.aitu.milestone2.controllers;

import kz.aitu.milestone2.models.User;
import kz.aitu.milestone2.services.interfaces.UserServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserServiceInterface service;

    public UserController(UserServiceInterface service) {
        this.service = service;
    }


    @GetMapping("/")
    public List<User> getAll(){
        return service.getAll();
    }

}



