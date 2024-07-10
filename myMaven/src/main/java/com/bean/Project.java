package com.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PROJECTS")
public class Project {
	@Id
	@Column(name="PR_ID",unique = true,nullable = false)
	private int pr_id;
	private String name;
	private String owner;
	@ManyToMany(mappedBy = "empAssignmentList")
	private List<Employees> employees;
	
	
	public int getPr_id() {
		return pr_id;
	}
	public void setPr_id(int pr_id) {
		this.pr_id = pr_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public List<Employees> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
	
	
	@Override
	public String toString() {
		return "Project [pr_id=" + pr_id + ", name=" + name + ", owner=" + owner + ", employees=" + employees + "]";
	}
	
	
	
}
