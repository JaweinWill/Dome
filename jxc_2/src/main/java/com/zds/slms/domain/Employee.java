package com.zds.slms.domain;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	private Integer id;//流水号
	private String code;//编号
	private String name;//姓名
	private String birthday;//生日
	private String sex;//性别 
	private String telephone;//电话
	private String email;//邮箱
//	private Set<Stockin> stockins=new HashSet<>();
//	private Set<Stockorder> stockorders=new HashSet<>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public Set getStockins() {
//		return stockins;
//	}
//	public void setStockins(Set stockins) {
//		this.stockins = stockins;
//	}
//	public Set getStockorders() {
//		return stockorders;
//	}
//	public void setStockorders(Set stockorders) {
//		this.stockorders = stockorders;
//	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", code=" + code + ", name=" + name + ", birthday=" + birthday + ", sex=" + sex
				+ ", telephone=" + telephone + ", email=" + email + "]";
	}
}
