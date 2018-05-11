package com.emmes.beans;


public class Employee {
@Override
	public String toString() {
		return "Employee [empName=" + empName + ", id=" + id + "]";
	}
public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
private String empName;
private int id;
}
