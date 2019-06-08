package com.example.demo.model;

public class Employee {
	private String eId;
	private String name;
	private String designation;
	private double salary;
	
	
	public Employee(String eId, String name, String designation, double salary) {
		
		this.eId = eId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	

}
