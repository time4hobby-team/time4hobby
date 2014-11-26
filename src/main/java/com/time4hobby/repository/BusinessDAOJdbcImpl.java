/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.repository;

import com.time4hobby.model.Business;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

@Service
public class BusinessDAOJdbcImpl implements BusinessDAO {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplateObject;
    private SimpleJdbcInsert userInsert;
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    private String BUSINESS_INSERT = "INSERT INTO businessInfo (name, street, apt#, city, state, zip, country, phone, email, password, category, specialization, website, duration, classesperweek, sampleclass, yearsofexperience) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String USERS_AUTH_INSERT = "insert into authentication (email, password, enabled) values (?,?,?)";
    private static final String USERS_ROLES_INSERT = "insert into authorization (id, authority) values (?, ?)";

    @Resource(name = "dataSource")
    public void setDataSource(DataSource dataSource) {
        String authenticationColumns[] = new String[]{"email", "password", "enabled"};
        this.userInsert = new SimpleJdbcInsert(dataSource).withTableName("authentication").usingColumns(authenticationColumns).usingGeneratedKeyColumns("id");
    }

    public void registerBusiness(Business business) {
        jdbcTemplate.update(BUSINESS_INSERT, new Object[]{business.getName(), business.getStreet(), business.getAptnumber(), business.getCity(), business.getState(), business.getZip(), business.getCountry(), business.getPhone(), business.getEmail(), business.getPassword(), business.getCategory(), business.getSpecialization(), business.getWebsite(), business.getDuration(), business.getClassesperweek(), business.getSampleclass(), business.getYearsofexperience()});

        try {
            Map<String, Object> authenticationColumnMap = new HashMap<String, Object>();
            authenticationColumnMap.put("email", business.getEmail());
            authenticationColumnMap.put("password", business.getPassword());
            authenticationColumnMap.put("enabled", 0);

            Number userId = userInsert.executeAndReturnKey(authenticationColumnMap);

            jdbcTemplate.update(USERS_ROLES_INSERT, new Object[]{userId, "ROLE_BUSINESS"});
        } catch (DataAccessException dae) {
            System.out.println("data access exception" + dae.getMessage());
        }
    }

    public List<Business> listBusiness() {
        String SQL = "select * from businessInfo";
        List<Business> businessList = jdbcTemplateObject.query(SQL, new BusinessMapper());
        return businessList;
    }
}
