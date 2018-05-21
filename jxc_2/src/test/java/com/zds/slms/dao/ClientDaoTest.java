package com.zds.slms.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zds.slms.domain.Client;
import com.zds.slms.domain.Employee;

public class ClientDaoTest {

	@Test
	public void testFindClient() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_beans.xml");
		ClientDao clientDao = (ClientDao) context.getBean("clientDao");
		Client client = new Client();
		client.setCode("1001");
		List<Client> list = clientDao.findClient(client);
		System.out.println(list);
	}

	@Test
	public void testFindClientById() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveClient() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateClient() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveOrUpdateClient() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelClientById() {
		fail("Not yet implemented");
	}

}
