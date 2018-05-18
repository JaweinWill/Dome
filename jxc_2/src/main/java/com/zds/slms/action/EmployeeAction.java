package com.zds.slms.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zds.slms.domain.Employee;
import com.zds.slms.service.EmployeeService;
import com.zds.slms.service.IEmployeeService;

import java.util.*;

public class EmployeeAction extends ActionSupport{
	private IEmployeeService employeeService;
	private Employee employee;//用来接收前端发来的数据（要找的员工编号与姓名）
	private List<Employee> employees;//集合用于存放查找所有员工对象
	private String[] sel;
	//查找员工
	public String findEmployee(){
		employees=employeeService.findEmployee(employee);
		return "findEmployee";
	}
	
	//增加
	public String saveEmployee(){
		this.employeeService.saveEmployee(employee);
		return "saveEmployee";
	};
	//修改
	public String saveOrUpdateEmployee(){
		this.employeeService.saveOrUpdateEmployee(employee);
		return "saveEmployee";
	}
	//删除
	public String delEmployee(){
		if(sel!=null){
			for(String s:sel){
				System.out.println(s);
				this.employeeService.delEmployeeById(Integer.parseInt(s));
			}
		}
		return "delEmployee";
	}
	//负责根据编号查找相应employee对象
	public String updateEmployee(){
		//1.根据编号（code）查找相应的对象
		employee=this.employeeService.findEmployeeById(employee.getCode()).get(0);
		return "updateEmployee";
	}

	public IEmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("execute");
		return super.execute();
	}
	public String[] getSel() {
		return sel;
	}
	public void setSel(String[] sel) {
		this.sel = sel;
	}
	

}
