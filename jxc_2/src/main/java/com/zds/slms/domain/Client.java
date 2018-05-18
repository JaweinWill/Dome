package com.zds.slms.domain;

public class Client {
	private Integer id;
	private String code;
	private String name;
	private String address;
	private String telephone;
	private String email;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String code, String name, String address, String telephone, String email) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.email = email;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	@Override
	public String toString() {
		return "Client [id=" + id + ", code=" + code + ", name=" + name + ", address=" + address + ", telephone="
				+ telephone + ", email=" + email + "]";
	}
	
	

}
