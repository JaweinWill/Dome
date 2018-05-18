package com.zds.slms.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zds.slms.domain.Stockin;

public class StockinServiceTest {

	@Test
	public void testFindStockin() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext_beans.xml");
	    StockinService stockinService=(StockinService) context.getBean("stockinService");
	    Stockin stockin = new Stockin();
		stockin.setCode("5001");
		List<Stockin> lists = stockinService.findStockin(stockin);
	    System.out.println(lists);
	}

}
