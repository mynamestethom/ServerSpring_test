package com.example.springsamsung.service;

import com.example.springsamsung.domain.User;

import java.util.List;

public interface UserService {
    User add(User user);
    List<User> getAll();
    User getById(long id);
    User update(User user);
    void deleteById(long id);
}
