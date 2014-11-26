/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.service;

import com.time4hobby.model.User;
import com.time4hobby.model.Registration;
import com.time4hobby.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User getUserByEmail(String email) {
        return userDAO.getUserByEmail(email);
    }

    @Override
    public void updateUser(User user, int userId) {
        userDAO.updateUser(user, userId);
    }

    @Override
    public void addUser(Registration registration) {
        userDAO.addUser(registration);
    }
}
