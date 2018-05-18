package com.zds.slms.service;

import java.util.List;

import com.zds.slms.dao.IClientDao;
import com.zds.slms.domain.Client;

public class ClientService implements IClientService{
	private IClientDao clientDao;

	public List<Client> findClient(Client client) {
		// 根据要找的信息（参数给出）查找所有的员工对象
		return clientDao.findClient(client);
	}

	public IClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public void saveClient(Client client) {
		// 将Client对象中的数据写入数据库，完成员工信息增加功能
		this.clientDao.saveClient(client);
	}

	@Override
	public void updateClient(Client client) {
		// 将Client对象中的数据写入数据库，完成员工信息增加功能
				this.clientDao.updateClient(client);
		
	}

	@Override
	public List<Client> findClientById(String code) {

		return this.clientDao.findClientById(code);
	}

	@Override
	public void saveOrUpdateClient(Client client) {
		this.clientDao.saveOrUpdateClient(client);
		
	}

	@Override
	public void delClientById(int clientId) {
		this.clientDao.delClientById(clientId);
	}

}
