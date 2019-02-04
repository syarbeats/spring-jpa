package com.learning.spring.spring_jpa.dao;

import java.util.List;
import com.learning.spring.spring_jpa.entity.Employee;

public interface IEmployeeDao {
	public void addEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public Employee getEmployee(int id);
	public List<Employee> getEmployeeList();

}
