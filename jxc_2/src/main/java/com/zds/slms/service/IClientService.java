package com.zds.slms.service;

import java.util.List;

import com.zds.slms.domain.Client;

public interface IClientService {

	List<Client> findClient(Client client);

	void saveClient(Client client);

	void saveOrUpdateClient(Client client);

	void delClientById(int parseInt);

	List<Client> findClientById(String code);

	void updateClient(Client client);

}
