package com.ita.u1.ssecurity.dao;

import com.ita.u1.ssecurity.entity.User;

import java.util.List;

public interface UserDAO {
    User findUserByFirstName(String firstName);
    List<User> getAllUsers();
}
