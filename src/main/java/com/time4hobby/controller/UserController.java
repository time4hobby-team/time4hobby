/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.controller;

import com.time4hobby.model.User;
import com.time4hobby.model.UserSessionInfo;
import com.time4hobby.service.UserService;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Sindhu
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserSessionInfo userSessionInfo;

    @RequestMapping(value = "/user/profile", method = RequestMethod.GET)
    public ModelAndView getProfile(Principal principal) {

        String email = principal.getName();
        userSessionInfo.setUser(userService.getUserByEmail(email));
        ModelAndView modelAndView = new ModelAndView("userProfile");
        modelAndView.addObject("user", userSessionInfo.getUser());
        return modelAndView;
    }

    /**
     *
     * @param business
     * @return
     */
    @RequestMapping(value = "/user/editProfile", method = RequestMethod.GET)
    public ModelAndView editProfile() {
        userSessionInfo.setUser(userService.getUserByEmail(userSessionInfo.getUser().getEmail()));
        ModelAndView modelAndView = new ModelAndView("editUserProfile");
        modelAndView.addObject("user", userSessionInfo.getUser());
        return modelAndView;
    }

    @RequestMapping(value = "/user/editProfile", method = RequestMethod.POST)
    public ModelAndView updateProfile(User user, BindingResult bindingResult) {
        userService.updateUser(user, userSessionInfo.getUser().getUserId());
        ModelAndView modelAndView = new ModelAndView("redirect:" + "/user/profile");
        return modelAndView;
    }
}
