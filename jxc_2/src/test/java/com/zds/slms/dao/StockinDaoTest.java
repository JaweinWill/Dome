package com.zds.slms.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zds.slms.domain.Employee;
import com.zds.slms.domain.Stockin;

public class StockinDaoTest {

	@Test
	public void testFindStockin() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_beans.xml");
		StockinDao stockinDao=(StockinDao) context.getBean("stockinDao");
	    Stockin stockin=new Stockin();
	    stockin.setCode("5001");
		List<Stockin> ss = stockinDao.findStockin(stockin);
		System.out.println(ss);
	}

}
