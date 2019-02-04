package com.learning.spring.spring_jpa.dao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.learning.spring.spring_jpa.dao.EmployeeDaoImpl;
import com.learning.spring.spring_jpa.entity.Employee;

@Component
public class EmployeeServices {
	
	@Autowired
	private EmployeeDaoImpl empDao;
	
	@Transactional
	public void addEmployee(Employee emp) {
		empDao.addEmployee(emp);
	}
}
