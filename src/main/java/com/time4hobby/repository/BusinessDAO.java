/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.repository;

import com.time4hobby.model.Business;
import java.util.List;

public interface BusinessDAO {

    public void registerBusiness(Business business);

    public List<Business> listBusiness();
}
