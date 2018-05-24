package com.zds.slms.service;

import java.util.List;

import com.zds.slms.dao.IStockinDao;
import com.zds.slms.domain.Stockin;

public class StockinService implements IStockinService {
    private IStockinDao stockinDao;
    public IStockinDao getStockinDao() {
    	return stockinDao;
    }
    public void setStockinDao(IStockinDao stockinDao) {
    	this.stockinDao = stockinDao;
    }
	@Override
	public List<Stockin> findStockin(Stockin stockin) {
		return stockinDao.findStockin(stockin);
	}
	@Override
	public void saveStockin(Stockin stockin) {
		stockinDao.saveStockin(stockin);
		
	}
	@Override
	public List<Stockin> findStockinByCode(String code) {
		System.out.println("findStockinByCode");
		Stockin stockin=new Stockin();
		stockin.setCode(code);
		System.out.println(stockinDao.findStockin(stockin));
		return stockinDao.findStockin(stockin);
	}
	@Override
	public void saveOrUpdateStockin(Stockin stockin) {
		stockinDao.saveOrUpdateStockin(stockin);
		
	}
	@Override
	public void delStockinById(Integer parseInt) {
		stockinDao.delStockinById(parseInt);
		
	}

}
