package com.employeemanagementsystem.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.employeemanagementsystem.beans.employee;
import com.employeemanagementsystem.service.EmployeeService;

public class EmployeeController {

	// @autowired
	private EmployeeService es;
	
	public int saveEmployee(@ModelAttribute employee emp){
		
		
		return this.es.createuser(emp);
		
	}
	
public int fetchEmployee(){
		
		
		return this.es.fetchuser();
		
	}
public int getempbyId(int id){
	
	return this.es.fetempById(id);
}


	
	
}
	

