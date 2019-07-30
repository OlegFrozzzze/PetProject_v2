package com.example.springwithjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/find-all")
    public List<Users> findAll(){
        return usersRepository.findAll();
    }
}
