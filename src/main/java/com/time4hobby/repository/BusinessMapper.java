/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.repository;

import com.time4hobby.model.Business;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Sindhu
 */
public class BusinessMapper implements RowMapper<Business> {

    public Business mapRow(ResultSet rs, int i) throws SQLException {
        Business business = new Business();
        business.setName(rs.getString("name"));
        business.setStreet(rs.getString("street"));
        business.setAptnumber(rs.getString("aptnumber"));
        business.setCity(rs.getString("city"));
        business.setState(rs.getString("state"));
        business.setZip(rs.getString("zip"));
        business.setCountry(rs.getString("country"));
        business.setPhone(rs.getString("phone"));
        business.setEmail(rs.getString("email"));
        business.setPassword(rs.getString("password"));
        business.setCategory(rs.getString("category"));
        business.setSpecialization(rs.getString("specialization"));
        business.setWebsite(rs.getString("website"));
        business.setDuration(rs.getString("duration"));
        business.setClassesperweek(rs.getString("classesperweek"));
        business.setSampleclass(rs.getString("sampleclass"));
        business.setYearsofexperience(rs.getString("yearsofexperience"));

        return business;
    }
}
