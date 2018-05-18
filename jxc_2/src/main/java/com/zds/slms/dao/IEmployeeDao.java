package com.zds.slms.dao;

import java.util.List;

import com.zds.slms.domain.Employee;

public interface IEmployeeDao {
	/**
	 * 
	 * @param employee 封装了要查找的编号与姓名的对象
	 * @return 符合条件的对象（用集合来存放）
	 */
	public List<Employee> findEmployee(Employee employee);
	/**
	 * 
	 * @param code  只根据编号来查
	 * @return 查找的对象
	 */
	public List<Employee> findEmployeeById(String code);
	
	/**
	 * 将Employee对象中的数据写入数据库，完成员工信息增加功能
	 * @param employee 封装了要写入数据库的Employee对象
	 */
	public void saveEmployee(Employee employee);
	
	/**
	 * 将Employee对象中的数据写入数据库，完成员工信息增加功能
	 * @param employee 封装了要写入数据库的Employee对象
	 */
	public void updateEmployee(Employee employee);
	//
	public void saveOrUpdateEmployee(Employee employee);
	public void delEmployeeById(int employeeId);
}
