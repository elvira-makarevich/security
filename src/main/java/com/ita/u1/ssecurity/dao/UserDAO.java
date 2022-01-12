package com.ita.u1.ssecurity.dao;

import com.ita.u1.ssecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

    User findUserByFirstName(String firstName);

    @Query("SELECT u FROM User u")
    List<User> getAllUsers();

}
