/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.repository;

import com.time4hobby.model.Hobby;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author spalakod
 */

    public class HobbyMapper implements RowMapper<Hobby> {

        @Override
        public Hobby mapRow(ResultSet rs, int rowNum) throws SQLException {
            Hobby hobby = new Hobby();
            hobby.setId(rs.getInt("id"));
            hobby.setName(rs.getString("name"));
            hobby.setCategory(rs.getString("category"));
            hobby.setSpecialization(rs.getString("specialization"));
            hobby.setPhone(rs.getString("phone"));
            hobby.setEmail(rs.getString("email"));
            hobby.setWebsite(rs.getString("website"));
            hobby.setDuration(rs.getString("duration"));
            hobby.setClassesperweek(rs.getString("classesperweek"));
            hobby.setSampleclass(rs.getString("sampleclass"));
            hobby.setState(rs.getString("state"));
            hobby.setCity(rs.getString("city"));
            hobby.setStreet(rs.getString("street"));
            hobby.setRating(rs.getInt("rating"));
            hobby.setImages(rs.getString("images"));
            hobby.setZip(rs.getString("zip"));
            hobby.setYearsofexperience(rs.getString("yearsofexperience"));
            hobby.setDescription(rs.getString("description"));
            
            
            return hobby;
        }
    }