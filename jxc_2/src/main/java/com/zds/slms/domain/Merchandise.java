package com.zds.slms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 商品类
 * （一侧）
 * @author Robin
 *
 */
public class Merchandise {
	private Integer id;// 流水号（数据库中主键）
	private String code;// 商品编号
	private String name;// 商品名称
	private Float price;// 商品单价
//	private Set<Stockin> stockins=new HashSet<>();//包含的订单

	// 无参数构造方法
	public Merchandise() {
		super();
	}

	// 有参数构造方法
	public Merchandise(String code, String name, float price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}

	// setter,getter方法
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	// toString 方法

	@Override
	public String toString() {
		return "Merchandise [id=" + id + ", code=" + code + ", name=" + name + ", price=" + price + "]";
	}

//	public Set<Stockin> getStockins() {
//		return stockins;
//	}
//
//	public void setStockins(Set<Stockin> stockins) {
//		this.stockins = stockins;
//	}

}
