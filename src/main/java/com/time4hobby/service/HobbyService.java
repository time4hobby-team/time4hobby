/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.service;

import com.time4hobby.model.Hobby;
import java.util.List;

public interface HobbyService {
    List<Hobby> getHobbiesByCity (String city);
}
