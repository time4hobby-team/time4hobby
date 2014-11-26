package com.time4hobby.repository;

import com.time4hobby.model.Registration;
import com.time4hobby.model.User;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOJdbcImpl implements UserDAO {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplateObject;
    private SimpleJdbcInsert userInsert;
    private static final String USERS_INFO_SELECT = "select userId, firstname, lastname, phone, email, state, city, address1, address2, image, zip, description from userInfo";
    private static final String USERS_AUTH_SELECT = "select id, email from authentication";
    private static final String USERS_INFO_INSERT = "insert into userInfo (userId, firstname, lastname, email, city, image) values (?, ?, ?, ?, ?, ?)";
    private static final String USERS_AUTH_INSERT = "insert into authentication (email, password, enabled) values (?, ?,?)";
    private static final String USER_AUTH_UPDATE = "update authentication set email=? where id=?";
    private static final String USER_INFO_UPDATE = "update userInfo set firstName=?, lastName=?, phone=?, email=?, description=?, address1=?, address2=?, city=?, state=?, zip=? where userId=?";
    private static final String HOBBY_PROFESSIONAL_UPDATE = "update hobbydetail set category=?, specialization=?, phone=?, email=?, website=?, duration=?, classesperweek=?, sampleclass=?, name=?, state=?, city=?, street=?, images=?, zip=?, description=?, yearsofexperience=? where userId=?";
    private static final String HOBBY_PROFESSIONAL_INSERT = "insert into hobbydetail (category,specialization,phone,email,website,duration,classesperweek,sampleclass,name,state,city,street,images,zip,description,yearsofexperience) values (?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?,?, ?, ?, ?)";
    private static final String HOBBY_PROFESSIONAL_SELECT = "select userId, email from hobbydetail where email=?";
    private static final String USERS_ROLES_INSERT = "insert into authorization (id, authority) values (?, ?)";
    private static final String USER_ROLE = "ROLE_USER";
    private static final String USER_ENABLE_BUSINESS = "update userInfo set isprofessional=? where userId=?";

    @Resource(name = "dataSource")
    public void setDataSource(DataSource dataSource) {
        String authenticationColumns[] = new String[]{"email", "password", "enabled"};
        this.userInsert = new SimpleJdbcInsert(dataSource).withTableName("authentication").usingColumns(authenticationColumns).usingGeneratedKeyColumns("id");
    }

    @Override
    public User getUserByEmail(String email) {
        User user = null;
        try {
            user = jdbcTemplateObject.queryForObject(USERS_INFO_SELECT + " where email = ?",
                    new Object[]{email}, new UserMapper());
        } catch (DataAccessException dae) {
            System.out.println("data access exception" + dae.getMessage());
        }
        return user;
    }

    @Override
    public void updateUser(User user, int userId) {

        jdbcTemplateObject.update(USER_INFO_UPDATE, new Object[]{user.getFirstname(), user.getLastname(), user.getPhone(), user.getEmail(),
            user.getDescription(), user.getAddress1(), user.getAddress2(), user.getCity(),
            user.getState(), user.getZip(), userId});
        jdbcTemplateObject.update(USER_AUTH_UPDATE, new Object[]{user.getEmail(), userId});
    }

    @Override
    public void addUser(Registration registration) {
        try {
            Map<String, Object> authenticationColumnMap = new HashMap<String, Object>();
            authenticationColumnMap.put("email", registration.getEmail());
            authenticationColumnMap.put("password", registration.getPassword());
            authenticationColumnMap.put("enabled", 1);

            Number userId = userInsert.executeAndReturnKey(authenticationColumnMap);
            //jdbcTemplateObject.update("insert into authorization (id, authority) values (?, 'USER_ROLE')", new Object[]{userId.intValue()});

            //jdbcTemplateObject.update(USERS_AUTH_INSERT, registration.getEmail(), registration.getPassword(), 1);
            jdbcTemplateObject.update(USERS_ROLES_INSERT, userId.intValue(), USER_ROLE);
            jdbcTemplateObject.update(USERS_INFO_INSERT, userId.intValue(), registration.getFirstName(), registration.getLastName(), registration.getEmail(), registration.getCity(), "/static/images/piano.png");
            //User user = jdbcTemplateObject.queryForObject(USERS_INFO_SELECT + " where email = ?",
            //        new Object[]{registration.getEmail()}, new UserMapper());


        } catch (DataAccessException dae) {
            System.out.println("data access exception" + dae.getMessage());
        }
    }
}
