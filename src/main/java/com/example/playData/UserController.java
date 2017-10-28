package com.example.playData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserReository repo;

    @GetMapping("/user")
    public Iterable<User> index() {
        return repo.findAll();
    }
}
