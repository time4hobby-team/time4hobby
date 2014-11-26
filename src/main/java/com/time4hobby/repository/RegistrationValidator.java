/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.repository;

import com.time4hobby.model.Registration;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

/**
 *
 * @author Sindhu
 */
@Component
public class RegistrationValidator {

    public boolean supports(Class<?> klass) {
        return Registration.class.isAssignableFrom(klass);
    }

    public void validate(Object target, Errors errors) {

        Registration registration = (Registration) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName",
                "NotEmpty.registration.firstName",
                "First Name must not be Empty.");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName",
                "NotEmpty.registration.lastName",
                "Last Name must not be Empty.");

        if ((registration.getFirstName().length()) > 50) {
            errors.rejectValue("firstName",
                    "lengthOfUser.registration.firstName",
                    "First Name must not more than 50 characters.");
        }

        if ((registration.getLastName().length()) > 50) {
            errors.rejectValue("userName",
                    "lengthOfUser.registration.userName",
                    "User Name must not more than 50 characters.");
        }

        if (!(registration.getPassword()).equals(registration
                .getConfirmPassword())) {
            errors.rejectValue("password",
                    "matchingPassword.registration.password",
                    "Password and Confirm Password Not match.");
        }
    }
}
