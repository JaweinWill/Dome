package com.zds.slms.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zds.slms.domain.Client;
import com.zds.slms.service.IClientService;

import java.util.*;

public class ClientAction extends ActionSupport{
	private IClientService clientService;
	private Client client;//用来接收前端发来的数据（要找的员工编号与姓名）
	private List<Client> clients;//集合用于存放查找所有员工对象
	private String[] sel;
	//查找员工
	public String findClient(){
		clients=clientService.findClient(client);
		return "findClient";
	}
	
	//增加
	public String saveClient(){
		this.clientService.saveClient(client);
		return "saveClient";
	};
	
	//修改
	public String saveOrUpdateClient(){
		this.clientService.saveOrUpdateClient(client);
		return "saveClient";
	}
	//删除
	public String delClient(){
		if(sel!=null){
			for(String s:sel){
				System.out.println(s);
				this.clientService.delClientById(Integer.parseInt(s));
			}
		}
		return "delClient";
	}
	//负责根据编号查找相应client对象
	public String updateClient(){
		//1.根据编号（code）查找相应的对象
		client=this.clientService.findClientById(client.getCode()).get(0);
		return "updateClient";
	}

	public IClientService getClientService() {
		return clientService;
	}

	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
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
