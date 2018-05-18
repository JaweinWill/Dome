package com.zds.slms.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zds.slms.domain.Merchandise;

public class MerchandiseServiceTest {

	@Test
	public void testFindMerchandise() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext_beans.xml");
	    MerchandiseService mService = (MerchandiseService) context.getBean("merchandiseService");
	    Merchandise merchandise=new Merchandise();
	    merchandise.setCode("001");
		List<Merchandise> ms = mService.findMerchandise(merchandise);
	    System.out.println(ms);
	}

}
