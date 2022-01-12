package com.ita.u1.ssecurity.service;

import com.ita.u1.ssecurity.dao.UserDAO;
import com.ita.u1.ssecurity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO= userDAO;
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        List<User> users = userDAO.getAllUsers();
        if (users == null || users.isEmpty()) {
            throw new RuntimeException("No users in database!");
        }
        return users;
    }

    @Transactional
    @Override
    public User findUserByFirstName(String firstName) {
        return userDAO.findUserByFirstName(firstName);
    }
}
