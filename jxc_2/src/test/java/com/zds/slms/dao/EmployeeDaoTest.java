package com.zds.slms.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zds.slms.domain.Employee;
import com.zds.slms.service.IEmployeeService;

public class EmployeeDaoTest {

	@Test
	public void testFindEmployee() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_beans.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setCode("001");
		List<Employee> list = employeeDao.findEmployee(employee);
		System.out.println(list);

	}
	@Test
	public void testsaveEmployee(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_beans.xml");
	    IEmployeeDao employeeDao = (IEmployeeDao) context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setCode("10000");
		employee.setName("六");
     	employeeDao.saveEmployee(employee);
	}

}
