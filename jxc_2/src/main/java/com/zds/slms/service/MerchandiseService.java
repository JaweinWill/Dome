package com.zds.slms.service;

import java.util.List;

import com.zds.slms.dao.MerchandiseDao;
import com.zds.slms.domain.Merchandise;

public class MerchandiseService implements IMerchandiseService{
    private MerchandiseDao merchandiseDao;
	@Override
	public List<Merchandise> findMerchandise(Merchandise merchandise) {	
		return merchandiseDao.findMerchandise(merchandise);
	}
	public MerchandiseDao getMerchandiseDao() {
		return merchandiseDao;
	}
	public void setMerchandiseDao(MerchandiseDao merchandiseDao) {
		this.merchandiseDao = merchandiseDao;
	}
	@Override
	public void saveOrUpdateMerchandise(Merchandise merchandise) {
		this.merchandiseDao.saveOrUpdateMerchandise(merchandise);
		
	}
	@Override
	public void delMerchandiseById(int parseInt) {
		this.merchandiseDao.delMerchandiseById(parseInt);
		
	}
	@Override
	public List<Merchandise> findMerchandiseById(Integer id) {
		return this.merchandiseDao.findMerchandiseById(id);
	}
	@Override
	public void saveMerchandise(Merchandise merchandise) {
		this.merchandiseDao.saveMerchandise(merchandise);
		
	}

}
