/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.repository;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.time4hobby.model.FileUpload;

public class FileUploadValidator implements Validator {

  
    public boolean supports(Class clazz) {
        //just validate the FileUpload instances
        return FileUpload.class.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {

        FileUpload file = (FileUpload) target;

        if (file.getFile().getSize() == 0) {
            errors.rejectValue("file", "required.fileUpload");
        }
    }
}
