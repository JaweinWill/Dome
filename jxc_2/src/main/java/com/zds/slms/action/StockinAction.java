package com.zds.slms.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zds.slms.domain.Client;
import com.zds.slms.domain.Merchandise;
import com.zds.slms.domain.Stockin;
import com.zds.slms.service.StockinService;
import com.zds.slms.service.IClientService;
import com.zds.slms.service.IMerchandiseService;
import com.zds.slms.service.IStockinService;

import java.util.*;

public class StockinAction extends ActionSupport {
	private IStockinService stockinService;
	private IMerchandiseService merchandiseService;
	private IClientService clientService;

	public IClientService getClientService() {
		return clientService;
	}

	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}

	/*
	 * 用来接收前端发来的数据（要找的进货单编号、货物的名称[商品名称]、供应商【客户】 进货日期、经手人[员工]）
	 * 
	 */
	private Stockin stockin;// 用于接收页面中传来的数据
	private List<Stockin> stockins;// 集合用于存放查找所有进货单对象
	private List<Merchandise> merchandises;// 所有商品
	private List<Client> clients;//所有客户
	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	private String[] sel;

	// 查找进货单
	public String findStockin() {
		merchandises = merchandiseService.findMerchandise(null);
		stockins = stockinService.findStockin(stockin);
		return "findStockin";
	}

	// 预查找（货物名称、经手人、供应商等下拉列表框中的内容）
	public String prepStockin() {
		// 从数据库取出所有的商品信息
		merchandises = merchandiseService.findMerchandise(null);
		System.out.println(merchandises);
		//再取客户信息
		clients=clientService.findClient(null);
		System.out.println(clients);
		return "prepStockin";
	}

	// 预增加
	public String preSaveStockin() {
		// 从数据库取出所有的商品信息
		merchandises = merchandiseService.findMerchandise(null);
		return "preSaveStockin";
	}

	// 增加
	public String saveStockin() {
		this.stockinService.saveStockin(stockin);
		return "saveStockin";
	};

	// 修改
	public String saveOrUpdateStockin() {
		// this.stockinService.saveOrUpdateStockin(stockin);
		return "saveStockin";
	}

	// 删除
	public String delStockin() {
		if (sel != null) {
			for (String s : sel) {
				System.out.println(s);
				// this.stockinService.delStockinById(Integer.parseInt(s));
			}
		}
		return "delStockin";
	}

	// 负责根据编号查找相应stockin对象
	public String updateStockin() {
		// 1.根据编号（code）查找相应的对象
		// stockin=this.stockinService.findStockinById(stockin.getCode()).get(0);
		return "updateStockin";
	}

	public IStockinService getStockinService() {
		return stockinService;
	}

	public void setStockinService(StockinService stockinService) {
		this.stockinService = stockinService;
	}

	public IMerchandiseService getMerchandiseService() {
		return merchandiseService;
	}

	public void setMerchandiseService(IMerchandiseService merchandiseService) {
		this.merchandiseService = merchandiseService;
	}

	public Stockin getStockin() {
		return stockin;
	}

	public void setStockin(Stockin stockin) {
		this.stockin = stockin;
	}

	public List<Stockin> getStockins() {
		return stockins;
	}

	public void setStockins(List<Stockin> stockins) {
		this.stockins = stockins;
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

	public List<Merchandise> getMerchandises() {
		return merchandises;
	}

	public void setMerchandises(List<Merchandise> merchandises) {
		this.merchandises = merchandises;
	}

}
