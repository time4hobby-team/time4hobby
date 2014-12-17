/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.controller;

import com.time4hobby.model.Registration;
import com.time4hobby.repository.RegistrationValidator;
import com.time4hobby.service.UserService;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("registration")
public class RegistrationController {

    @Autowired
    private UserService userService;
    @Autowired
    private RegistrationValidator registrationValidator;
    @Autowired
    private UserController userController;
//    @Resource(name = "authenticationManager")
//    private AuthenticationManager authenticationManager;

    // Display the form on the get request
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String showRegistration(Map model) {
        Registration registration = new Registration();
        model.put("registration", registration);
        return "registrationForm";
    }

    // Process the form.
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String processRegistration(@Valid Registration registration,
            BindingResult result, HttpServletRequest request, HttpServletResponse response) {
        // set custom Validation by user
        registrationValidator.validate(registration, result);
        if (result.hasErrors()) {
            System.out.println("HAS ERRORSSS");
            return "registrationForm";
            // return new ModelAndView("forward:/signup");

        }
        userService.addUser(registration);

//        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(registration.getEmail(), registration.getPassword());
//        // generate session if one doesn't exist
//        request.getSession();
//        token.setDetails(new WebAuthenticationDetails(request));
//
//        try {
//            Authentication auth = authenticationManager.authenticate(token);
//
//            SecurityContextHolder.getContext().setAuthentication(auth);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // return "redirect:/user/profile";
        return "login";

        //  return "registrationSuccess";
        // return "forward:/user/profile";
//        String url = request.getContextPath() + "/j_security_check";
//        return response.sendRedirect(url + "?j_username="
//                + URLEncoder.encode(username, "UTF-8")
//                + "&j_password="
//                + URLEncoder.encode(password, "UTF-8"));
    }
}
