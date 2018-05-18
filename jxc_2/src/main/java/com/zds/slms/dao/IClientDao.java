package com.zds.slms.dao;

import java.util.List;

import com.zds.slms.domain.Client;

public interface IClientDao {

	List<Client> findClient(Client client);

	void saveClient(Client client);

	void updateClient(Client client);

	List<Client> findClientById(String code);

	void saveOrUpdateClient(Client client);

	void delClientById(int clientId);

}
