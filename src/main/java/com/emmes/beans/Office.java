package com.emmes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Office {
@Override
	public String toString() {
		return "Office [officeName=" + officeName + ", employee=" + employee
				+ "]";
	}
public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
private String officeName;
@Autowired
@Qualifier("emp1")
private Employee employee;
}
