package com.employeemanagementsystem.service;

import com.employeemanagementsystem.beans.employee;
import com.employeemanagementsystem.dao.employeeDao;

public class EmployeeService {
	// @autowired
	private employeeDao empdao;

	public int createuser(employee emp) {
		return this.empdao.insertUser(emp);
	}

	public int fetchuser() {
		return this.empdao.retriveUser();
	}

	public int fetempById(int id) {

		return this.empdao.fetchId(id);
	}

}
