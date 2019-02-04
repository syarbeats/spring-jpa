package com.learning.spring.spring_jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.spring_jpa.dao.EmployeeDaoImpl;
import com.learning.spring.spring_jpa.dao.services.EmployeeServices;
import com.learning.spring.spring_jpa.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx =  new ClassPathXmlApplicationContext("META-INF/application-context.xml");
        EmployeeServices empDaoImpl = (EmployeeServices) ctx.getBean(EmployeeServices.class);
        empDaoImpl.addEmployee(new Employee(303, "Goerge Martin", 65000));
        
    }
}
