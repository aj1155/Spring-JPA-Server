package com.skhu.Ian.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="user")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name = "name", length = 15)
	private String name;
	
	@Column(name = "phone_number", length = 13)
	private String phone_number;
	
	@Column(name = "email", length = 45)
	private String email;
	
	@Column(name = "grade")
	private int grade;
	
	@Column(name = "social_status")
	private String social_status;
	
	@Column(name = "company_address")
	private String company_address;
	
	@Column(name="gradeyear")
	private long gradeyear;
	
	@Column(name = "company")
	private String company;
	
	public String getCompany_address() {
		return company_address;
	}

	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}

	public long getGradeyear() {
		return gradeyear;
	}

	public void setGradeyear(long gradeyear) {
		this.gradeyear = gradeyear;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSocial_status() {
		return social_status;
	}

	public void setSocial_status(String social_status) {
		this.social_status = social_status;
	}

	
	
	
	
}
