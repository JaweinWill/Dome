package com.zds.slms.service;

import java.util.List;

import com.zds.slms.domain.Merchandise;

public interface IMerchandiseService {
	/**
	 * 
	 * @param merchandise 封装了要查找的商品编号与商品名称的对象
	 * @return 符合条件的对象（用集合来存放）
	 */
	public List<Merchandise> findMerchandise(Merchandise merchandise);

	public void saveOrUpdateMerchandise(Merchandise merchandise);

	public void delMerchandiseById(int parseInt);

	public List<Merchandise> findMerchandiseById(Integer id);

	public void saveMerchandise(Merchandise merchandise);
}
