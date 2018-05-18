package com.zds.slms.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zds.slms.domain.Merchandise;

public class MerchandiseDaoTest {

	@Test
	public void testFindMerchandise() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_beans.xml");
		MerchandiseDao merchandiseDao = (MerchandiseDao) context.getBean("merchandiseDao");
		Merchandise merchandise = new Merchandise();
		merchandise.setCode("001");
		List<Merchandise> ms = merchandiseDao.findMerchandise(merchandise);
		System.out.println(ms);
	}

}
