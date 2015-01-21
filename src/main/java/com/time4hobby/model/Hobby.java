/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author spalakod
 */

@Entity
@Table(name = "hobbydetail")
public class Hobby {

	private String name;
	private Integer id;
	private String category;
	private String specialization;
	private String phone;
	private String email;
//	private String description;
	private String website;
	private String duration;
	private String classesperweek;
	private String sampleclass;
	private String state;
	private String city;
	private String street;
//	private int rating;
//	private String images;
//	private String zip;
//	private String yearsofexperience;

/*	public String getYearsofexperience() {
		return yearsofexperience;
	}
*/
/*	public void setYearsofexperience(String yearsofexperience) {
		this.yearsofexperience = yearsofexperience;
	}*/

/*	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}*/

//	public String getZip() {
//		return zip;
//	}

//	public void setZip(String zip) {
//		this.zip = zip;
//	}

//	public int getRating() {
//		return rating;
//	}

//	public void setRating(int rating) {
//		this.rating = rating;
//	}

//	public String getImages() {
//		return images;
//	}

//	public void setImages(String images) {
//		this.images = images;
//	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setClassesperweek(String classesperweek) {
		this.classesperweek = classesperweek;
	}

	public void setSampleclass(String sampleclass) {
		this.sampleclass = sampleclass;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	@Column(name = "street")
	public String getStreet() {
		return street;
	}

	@Column(name = "city")
	public String getCity() {
		return city;
	}

	@Column(name = "state")
	public String getState() {
		return state;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	@Column(name = "sampleclass")
	public String getSampleclass() {
		return sampleclass;
	}

	@Column(name = "classesperweek")
	public String getClassesperweek() {
		return classesperweek;
	}

	@Column(name = "duration")
	public String getDuration() {
		return duration;
	}

	@Column(name = "website")
	public String getWebsite() {
		return website;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}

	@Column(name = "specialization")
	public String getSpecialization() {
		return specialization;
	}

	@Column(name = "category")
	public String getCategory() {
		return category;
	}

}
