package com.ita.u1.ssecurity.service;

import com.ita.u1.ssecurity.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User findUserByFirstName(String firstName);
}