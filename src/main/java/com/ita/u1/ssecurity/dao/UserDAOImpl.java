package com.ita.u1.ssecurity.dao;

import com.ita.u1.ssecurity.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    public static final String SELECT_USERS_FROM_DB = "SELECT u FROM User u";
    public static final String SELECT_USER_BY_FIRST_NAME = "SELECT u FROM User u WHERE first_name=:firstName";
    public static final String FIRST_NAME = "firstName";

    private SessionFactory sessionFactory;

    @Autowired
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User findUserByFirstName(String firstName) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query theQuery = currentSession.createQuery(SELECT_USER_BY_FIRST_NAME);
        theQuery.setParameter(FIRST_NAME, firstName);
        User user = (User) theQuery.getSingleResult();
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query theQuery = currentSession.createQuery(SELECT_USERS_FROM_DB);
        List<User> users = theQuery.getResultList();
        return users;
    }
}
