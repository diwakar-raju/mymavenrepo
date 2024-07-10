package com.bean;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMP_Id",nullable=false,unique = true)
	
	private long emp_id;
	private String Name;
	private String department;
	private long salary;
	

	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)  //fetch child with parent class
	@JoinColumn(name="EMP_Id")  //foreign key generated
	private List<Assetmgnt> assest;
	
	
	
	@OneToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="EMP_Id")
	private Emp_details emp_Details;
	
	
	
	@ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name="emp_assignments",
	joinColumns = {@JoinColumn(name="EMP_Id")},
	inverseJoinColumns = {@JoinColumn(name="PR_ID")})
	 
	private List<Project>empAssignmentList;
	
	public List<Project> getEmpAssignmentList() {
		return empAssignmentList;
	}
	public void setEmpAssignmentList(List<Project> empAssignmentList) {
		this.empAssignmentList = empAssignmentList;
	}
	public List<Assetmgnt> getAssest() {
		return assest;
	}
	public void setAssest(List<Assetmgnt> assest) {
		this.assest = assest;
	}
	
	
	public Emp_details getEmp_Details() {
		return emp_Details;
	}
	public void setEmp_Details(Emp_details emp_Details) {
		this.emp_Details = emp_Details;
	}
	private Date joined_on;
	
	
	public long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Date getJoined_on() {
		return joined_on;
	}
	public void setJoined_on(Date joined_on) {
		this.joined_on = joined_on;
	}
	@Override
	public String toString() {
		return "Employees [emp_id=" + emp_id + ", Name=" + Name + ", department=" + department + ", salary=" + salary
				+ ", assest=" + assest + ", emp_Details=" + emp_Details + ", empAssignmentList=" + empAssignmentList
				+ ", joined_on=" + joined_on + "]";
	}
	


}
