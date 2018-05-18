package com.zds.slms.dao;

import java.util.List;

import com.zds.slms.domain.Stockin;

public interface IStockinDao {
	public List<Stockin> findStockin(Stockin stockin);

	public void saveStockin(Stockin stockin);

}
