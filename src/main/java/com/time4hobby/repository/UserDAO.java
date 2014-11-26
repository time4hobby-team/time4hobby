package com.time4hobby.repository;

import com.time4hobby.model.Registration;
import com.time4hobby.model.User;
import java.util.List;

public interface UserDAO {

    public User getUserByEmail(String email);

    public void updateUser(User user, int userId);

    public void addUser(Registration registration);
}
