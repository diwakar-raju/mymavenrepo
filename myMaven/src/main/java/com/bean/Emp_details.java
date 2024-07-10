package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_details")
public class Emp_details {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ED_Id",unique = true,nullable = false)
	private long ed_id;
	
	private String address;
	private String gender;
	
	@Column(name="YEARS_OF_SERVICE")
	private long years_of_service;
	
	@Column(name="BANK_ACCOUNT")
	private long bank_account;
	
	@Column(name="EMP_ID")
	private long emp_id;

	public long getEd_id() {
		return ed_id;
	}

	public void setEd_id(long ed_id) {
		this.ed_id = ed_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getYears_of_service() {
		return years_of_service;
	}

	public void setYears_of_service(long years_of_service) {
		this.years_of_service = years_of_service;
	}

	public long getBank_account() {
		return bank_account;
	}

	public void setBank_account(long bank_account) {
		this.bank_account = bank_account;
	}

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	@Override
	public String toString() {
		return "Emp_details [ed_id=" + ed_id + ", address=" + address + ", gender=" + gender + ", years_of_service="
				+ years_of_service + ", bank_account=" + bank_account + ", emp_id=" + emp_id + "]";
	}
	
	
	
	
		
}
