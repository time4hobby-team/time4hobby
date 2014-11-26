/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.model;

/**
 *
 * @author spalakod
 */
public class Hobby {
    
   private String name;
   private Integer id;
   private String category;
   private String specialization;
   private String phone;
   private String email;
   private String description;
   private String website;
   private String duration;
   private String classesperweek;
   private String sampleclass;
   private String state;
   private String city;
   private String street;
   private int rating;
   private String images;
   private String zip;
   private String yearsofexperience;

    public String getYearsofexperience() {
        return yearsofexperience;
    }

    public void setYearsofexperience(String yearsofexperience) {
        this.yearsofexperience = yearsofexperience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
  

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getClassesperweek() {
        return classesperweek;
    }

    public void setClassesperweek(String classesperweek) {
        this.classesperweek = classesperweek;
    }

    public String getSampleclass() {
        return sampleclass;
    }

    public void setSampleclass(String sampleclass) {
        this.sampleclass = sampleclass;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
   
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   
    public void setCategory(String category) {
      this.category = category;
   }
   public String getCategory() {
      return category;
   }

   public void setId(Integer id) {
      this.id = id;
   }
   public Integer getId() {
      return id;
   }
    
}
