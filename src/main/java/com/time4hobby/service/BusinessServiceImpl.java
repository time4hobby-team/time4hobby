/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.service;

import com.time4hobby.model.Business;
import com.time4hobby.repository.BusinessDAO;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sindhu
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @Resource
    BusinessDAO businessDAO;

    public void registerBusiness(Business business) {
        businessDAO.registerBusiness(business);
    }
}
