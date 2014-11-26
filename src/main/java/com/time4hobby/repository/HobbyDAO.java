/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.repository;

import com.time4hobby.model.Hobby;
import java.util.List;

/**
 *
 * @author spalakod
 */
public interface HobbyDAO {

    /**
     * This is the method to be used to create a record in the Student table.
     */
    public void insertRecord(String category, String specialization, String phone, String email, String website, String duration, String classesperweek, String sampleclass, String name, String state, String city, String street);

    /**
     * This is the method to be used to list down a record from the Hobby table
     * corresponding to a passed hobby id.
     */
    public Hobby getHobby(String category);

    /**
     * This is the method to be used to list down all the records from the Hobby
     * table.
     */
    public List<Hobby> listHobbies();

    /**
     * This is the method to be used to delete a record from the Hobby table
     * corresponding to a passed Hobby id.
     */
    public void delete(Integer id);

    /**
     * This is the method to be used to update a record into the Hobby table.
     */
    public void update(Integer id, String name);

    /*
     * Lists results based on hobby name
     */
    public List<Hobby> listHobbyResults(String category);

    public List<Hobby> listHobbyResultsByCategoryAndCity(String category, String city);

    public List<Hobby> listHobbyResultsByCity(String city);

    public List<Hobby> listHobbyResultsBySpec(String hobby, String spec);

    public List<Hobby> listProfile(int profileId);
}
