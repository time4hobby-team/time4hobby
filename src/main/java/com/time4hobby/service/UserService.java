/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.service;

import com.time4hobby.model.User;
import com.time4hobby.model.Registration;

/**
 *
 * @author Sindhu
 */
public interface UserService {

    public User getUserByEmail(String email);

    public void updateUser(User user, int userId);

    public void addUser(Registration registration);
}
