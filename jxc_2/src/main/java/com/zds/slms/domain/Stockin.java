package com.zds.slms.domain;

/**
 * 进货单（多侧）
 * @author Robin
 *
 */
public class Stockin {
	private Integer id;//流水号
	private String code;//编号
	private Merchandise merchandise;//商品对象
	private Client client;//客户信息（供应商）
	private Employee employee;//员工（经手人）
	private Integer amount;//商品数量
	private Float price;//商品单价
	private Float money;//商品金额
	private String stockindate;//进货日期
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
	public Merchandise getMerchandise() {
		return merchandise;
	}
	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getMoney() {
		return money;
	}
	public void setMoney(Float money) {
		this.money = money;
	}
	public String getStockindate() {
		return stockindate;
	}
	public void setStockindate(String stockindate) {
		this.stockindate = stockindate;
	}
	@Override
	public String toString() {

		return "Stockin [id=" + id + ", code=" + code + ", merchandise=" + merchandise + ", client=" + client
				+ ", employee=" + employee + ", amount=" + amount + ", price=" + price + ", money=" + money
				+ ", stockindate=" + stockindate + "]";
	}
	
	
	
	
	

}
