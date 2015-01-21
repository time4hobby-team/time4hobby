/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.repository;

import com.time4hobby.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author spalakod
 */
public class UserMapper implements RowMapper<User> {

    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setUserId(rs.getInt("userId"));
        user.setFirstname(rs.getString("firstname"));
        user.setLastname(rs.getString("lastname"));
        user.setPhone(rs.getString("phone"));
        user.setEmail(rs.getString("email"));
        user.setState(rs.getString("state"));
        user.setCity(rs.getString("city"));
        user.setAddress1(rs.getString("address1"));
        user.setAddress2(rs.getString("address2"));
        user.setImage(rs.getString("image"));
        user.setZip(rs.getString("zip"));
        user.setDescription(rs.getString("description"));


        return user;
    }
}
