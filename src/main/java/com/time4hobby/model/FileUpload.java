/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.model;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Sindhu
 */
public class FileUpload {

    MultipartFile file;
    //getter and setter methods

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
