package com.example.worskshopmongo.services;

import com.example.worskshopmongo.domain.User;
import com.example.worskshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired // Faz a auto implementação do objeto através do Spring boot
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
