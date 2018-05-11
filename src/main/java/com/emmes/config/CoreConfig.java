package com.emmes.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.emmes.beans.Employee;
import com.emmes.beans.Office;

@Configuration
@ComponentScan("com.emmes")
public class CoreConfig {
	
	@Bean(name="office")
	public Office getOffice(){
		Office office=new Office();
		office.setOfficeName("EMMES");
		return office;
	}
	
	@Bean
	@Qualifier("emp")
	public Employee getEmployee(){
		Employee employee= new Employee();
		employee.setEmpName("chandu");
		employee.setId(1);
		return employee;
	}
	@Bean
	@Qualifier("emp1")
	public Employee getEmployee1(){
		Employee employee= new Employee();
		employee.setEmpName("siva");
		employee.setId(2);
		return employee;
	}

}
