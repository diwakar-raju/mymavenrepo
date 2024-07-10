package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asset_mngt")
public class Assetmgnt {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AM_ID",nullable=false,unique = true)
	private long am_id;
	@Column(name="EMP_Id")
	private long emp_id;
	private String asset_name;
	private String 	vendor;
	
	
	public long getAm_id() {
		return am_id;
	}
	public void setAm_id(long am_id) {
		this.am_id = am_id;
	}
	public long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}
	public String getAsset_name() {
		return asset_name;
	}
	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	@Override
	public String toString() {
		return "Assetmgnt [am_id=" + am_id + ", emp_id=" + emp_id + ", asset_name=" + asset_name + ", vendor=" + vendor
				+ "]";
	}
	
	
	

}
