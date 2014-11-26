/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.model;

/**
 *
 * @author Sindhu
 */
public class User {

    private int id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String description;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String image;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getUserComments() {
//        return userComments;
//    }
//    public void setUserComments(String userComments) {
//        this.userComments = userComments;
//    }
//
//    public String getUserRatings() {
//        return userRatings;
//    }
//    public void setUserRatings(String userRatings) {
//        this.userRatings = userRatings;
//    }
//
//    public String getUserReviews() {
//        return userReviews;
//    }
//
//    public void setUserReviews(String userReviews) {
//        this.userReviews = userReviews;
//    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    private String zip;

    public int getUserId() {
        return id;
    }

    public void setUserId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastName) {
        this.lastname = lastName;
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

    public String getMyDescription() {
        return description;
    }

    public void setMyDescription(String myDescription) {
        this.description = myDescription;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
