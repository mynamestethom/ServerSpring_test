package com.example.springsamsung.service.reliz;

import com.example.springsamsung.domain.User;
import com.example.springsamsung.repository.UserRepository;
import com.example.springsamsung.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServicereliz implements UserService {

    private  final UserRepository repository;

    @Autowired
    public UserServicereliz(UserRepository repository){
        this.repository = repository;

    }
    @Override
    public User add(User user) {
        //
        return repository.save(user);
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public User update(User user) {
        //
        return repository.save(user);
    }

    @Override
    public void deleteById(long id) {

    }
}
