/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.service;

import com.time4hobby.model.Hobby;
import com.time4hobby.repository.HobbyDAO;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sindhu
 */
@Service
public class HobbyServiceImpl implements HobbyService {
    
    @Resource
    private HobbyDAO hobbyDAO; 
    
    public List<Hobby> getHobbiesByCity (String city) {
        return hobbyDAO.listHobbyResultsByCity(city);
    }
}
