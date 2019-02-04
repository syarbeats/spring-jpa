package com.learning.spring.spring_jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.learning.spring.spring_jpa.entity.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addEmployee(Employee emp) {
		em.persist(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}

}
