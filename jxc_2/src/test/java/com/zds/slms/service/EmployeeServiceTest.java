package com.zds.slms.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zds.slms.domain.Employee;

public class EmployeeServiceTest {

	@Test
	public void testFindEmployee() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext_beans.xml");
	    EmployeeService employeeService=(EmployeeService) context.getBean("employeeService");
	    Employee employee = new Employee();
		employee.setCode("1001");
		List<Employee> lists = employeeService.findEmployee(employee);
	    System.out.println(lists);
	}
	
	@Test
	public void testsaveEmployee(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext_beans.xml");
	    EmployeeService employeeService=(EmployeeService) context.getBean("employeeService");
	    Employee employee = new Employee();
		employee.setCode("1006");
		employee.setName("孙七");
		employeeService.saveEmployee(employee);
	}

}
