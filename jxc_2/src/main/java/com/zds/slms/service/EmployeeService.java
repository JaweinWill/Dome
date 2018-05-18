package com.zds.slms.service;

import java.util.List;

import com.zds.slms.dao.EmployeeDao;
import com.zds.slms.dao.IEmployeeDao;
import com.zds.slms.domain.Employee;

public class EmployeeService implements IEmployeeService{
	private IEmployeeDao employeeDao;

	public List<Employee> findEmployee(Employee employee) {
		// 根据要找的信息（参数给出）查找所有的员工对象
		return employeeDao.findEmployee(employee);
	}

	public IEmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void saveEmployee(Employee employee) {
		// 将Employee对象中的数据写入数据库，完成员工信息增加功能
		this.employeeDao.saveEmployee(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// 将Employee对象中的数据写入数据库，完成员工信息增加功能
				this.employeeDao.updateEmployee(employee);
		
	}

	@Override
	public List<Employee> findEmployeeById(String code) {

		return this.employeeDao.findEmployeeById(code);
	}

	@Override
	public void saveOrUpdateEmployee(Employee employee) {
		this.employeeDao.saveOrUpdateEmployee(employee);
		
	}

	@Override
	public void delEmployeeById(int employeeId) {
		this.employeeDao.delEmployeeById(employeeId);
	}

}
