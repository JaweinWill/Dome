package com.zds.slms.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void test() {
		Employee employee=new Employee();
		employee.setId(1);
		employee.setCode("11011");
		employee.setName("张三");
		employee.setSex("男");
		System.out.println(employee);
	}

}
