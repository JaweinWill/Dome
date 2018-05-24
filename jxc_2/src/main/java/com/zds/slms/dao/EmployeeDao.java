package com.zds.slms.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zds.slms.domain.Employee;

public class EmployeeDao extends HibernateDaoSupport implements IEmployeeDao{
	public List<Employee> findEmployee(Employee employee) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Employee.class);
		if(null!=employee){
			if(null!=employee.getId()){
				criteria.add(Restrictions.eq("id", employee.getId()));
			}
			if(null!=employee.getCode()&& employee.getCode().trim().length()>0){
				criteria.add(Restrictions.eq("code", employee.getCode()));
			}
			if(null!=employee.getName()&& employee.getName().trim().length()>0){
				criteria.add(Restrictions.like("name", employee.getName(),MatchMode.ANYWHERE));
			}
			
		}
		return (List<Employee>) this.getHibernateTemplate().findByCriteria(criteria);
	}
	/**
	 * 
	 * @param employee  只根据编号来查
	 * @return 查找的对象
	 */
	public List<Employee> findEmployeeById(String code) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Employee.class);
		if(null!=code){
				criteria.add(Restrictions.eq("code", code));
		}
		return (List<Employee>) this.getHibernateTemplate().findByCriteria(criteria);
	}
	

	/**
	 * 将Employee对象中的数据写入数据库，完成员工信息增加功能
	 * @param employee 封装了要写入数据库的Employee对象
	 */
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
				this.getHibernateTemplate().save(employee);
		
	}
	@Override
	public void saveOrUpdateEmployee(Employee employee) {
		Employee emp=this.getHibernateTemplate().get(Employee.class, employee.getId());
		emp.setCode(employee.getCode());
		emp.setName(employee.getName());
		emp.setSex(employee.getSex());
		emp.setTelephone(employee.getTelephone());
		emp.setBirthday(employee.getBirthday());
		emp.setEmail(employee.getEmail());
		this.getHibernateTemplate().update(emp);	
	}
	@Override
	public void delEmployeeById(int employeeId) {
		Employee employee=this.getHibernateTemplate().get(Employee.class, employeeId);
	    this.getHibernateTemplate().delete(employee);
	}

}
