package com.zds.slms.service;

import java.util.List;

import com.zds.slms.domain.Employee;
import com.zds.slms.domain.Stockin;

public interface IStockinService {
	public List<Stockin> findStockin(Stockin stockin);

	public void saveStockin(Stockin stockin);

	public List<Stockin> findStockinByCode(String code);

	public void saveOrUpdateStockin(Stockin stockin);

	public void delStockinById(Integer parseInt);
}
