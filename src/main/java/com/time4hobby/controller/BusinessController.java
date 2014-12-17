package com.time4hobby.controller;

import com.time4hobby.model.Business;
import com.time4hobby.service.BusinessService;
import com.time4hobby.service.MailService;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/business")
public class BusinessController {

    @Autowired
    MailService mailService;
    @Resource
    private BusinessService businessService;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView displayBusinessSignupForm() {
        return new ModelAndView("BusinessSignUp")
                .addObject("business", new Business());
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ModelAndView registerBusiness(Business business, BindingResult result) {

        businessService.registerBusiness(business);
        String subject = "Welcome to time4hobby.com!";
        String body = "test";

        mailService.sendMail("time4hobby.team@gmail.com", business.getEmail(), subject, body);
        return new ModelAndView("BusinessSignUp")
                .addObject("success", true);
    }
}
