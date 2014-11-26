/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.repository;

import com.time4hobby.model.Hobby;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author spalakod
 */
@Repository
public class HobbyDAOImpl implements HobbyDAO {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplateObject;

    public void insertRecord(String category, String specialization, String phone, String email, String website, String duration, String classesperweek, String sampleclass, String name, String state, String city, String street) {
        String SQL = "insert into hobbydetail (category,specialization,phone,email,website,duration,classesperweek,sampleclass,name,state,city,street) values (?, ?)";

        jdbcTemplateObject.update(SQL, category, specialization, phone, email, website, duration, classesperweek, sampleclass, name, state, city, street);
    }

    public Hobby getHobby(String category) {
        String SQL = "select * from hobbydetail where category = ?";
        Hobby hobby = jdbcTemplateObject.queryForObject(SQL, new Object[]{category}, new HobbyMapper());
        return hobby;
    }

    public List<Hobby> listHobbies() {
        String SQL = "select * from hobbydetail";
        List<Hobby> hobbies = jdbcTemplateObject.query(SQL, new HobbyMapper());
        return hobbies;
    }

    public List<Hobby> listHobbyResults(String category) {
        String SQL = "select * from hobbydetail where category=" + category;
        List<Hobby> hobbies = jdbcTemplateObject.query(SQL, new HobbyMapper());
        return hobbies;
    }

    public List<String> listHobbyNames() {
        String SQL = "select * from hobbydetail";
        List<String> hobbyNames = new ArrayList<String>();
        List<Hobby> hobbies = jdbcTemplateObject.query(SQL, new HobbyMapper());
        for (Hobby hobby : hobbies) {
            hobbyNames.add(hobby.getName() + "," + hobby.getCategory());
        }
        return hobbyNames;
    }

    public void delete(Integer id) {
        String SQL = "delete from cities where id = ?";
        jdbcTemplateObject.update(SQL, id);
    }

    public void update(Integer id, String name) {
        String SQL = "update cities set name = ? where id = ?";
        jdbcTemplateObject.update(SQL, name, id);
        System.out.println("Updated Record with ID = " + id);
    }

    public List<Hobby> listProfile(int profileId) {
        String SQL = "select * from hobbydetail where id=" + profileId;
        List<Hobby> hobbies = jdbcTemplateObject.query(SQL, new HobbyMapper());

        return hobbies;
    }

    public List<Hobby> listHobbyResultsByCity(String city) {
        String SQL = "select * from hobbydetail where city=?";
        List<Hobby> hobbies = jdbcTemplateObject.query(SQL, new HobbyMapper(), city);

        return hobbies;
    }

    public List<Hobby> listHobbyResultsByCategoryAndCity(String category, String city) {
        System.out.println("category:" + category + " city: " + city);
        //String SQL = "" + city + " and category=" + category;
        List<Hobby> hobbies = null;
        try {
            hobbies = jdbcTemplateObject.query("select * from hobbydetail where city='?' and category=?", new HobbyMapper(), city, category);
        } catch (Exception e) {
            System.out.println("Exception occurred" + e.getMessage());
        }

        return hobbies;
    }

    public List<Hobby> listHobbyResultsBySpec(String category, String specialization) {
        System.out.println("category " + category);
        System.out.println("specialization " + specialization);
        List<Hobby> hobbies = null;
        try {
            if (specialization.equals("All")) {
                hobbies = jdbcTemplateObject.query("select * from hobbydetail where category=?", new HobbyMapper(), category);
            } else {
                hobbies = jdbcTemplateObject.query("select * from hobbydetail where category=? and specialization=?", new HobbyMapper(), category, specialization);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred" + e.getMessage());
        }
        return hobbies;
    }
}
