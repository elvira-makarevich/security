package com.ita.u1.ssecurity.controller;

import com.ita.u1.ssecurity.entity.User;
import com.ita.u1.ssecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    public static final String LOGIN_PAGE = "login";
    public static final String INDEX_PAGE = "index";
    public static final String LIST_USERS = "users";
    public static final String PAGE_USERS = "list-users";

    private UserService userService;

    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String main() {
        return INDEX_PAGE;
    }

    @GetMapping(value = "/showLoginPage")
    public String login() {
        return LOGIN_PAGE;
    }

    @GetMapping(value = "/users")
    public ModelAndView getUsers() {
        List<User> users = userService.getAllUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(PAGE_USERS);
        modelAndView.addObject(LIST_USERS, users);
        return modelAndView;
    }
}