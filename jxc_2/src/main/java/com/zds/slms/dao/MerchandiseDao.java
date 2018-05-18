package com.zds.slms.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zds.slms.domain.Merchandise;
import com.zds.slms.domain.Merchandise;

public class MerchandiseDao extends HibernateDaoSupport implements IMerchandiseDao{
	/**
	 * 
	 * @param merchandise 封装了要查找的商品编号与商品名称的对象
	 * @return 符合条件的对象（用集合来存放）
	 */
	@Override
	public List<Merchandise> findMerchandise(Merchandise merchandise) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Merchandise.class);
		if(null!=merchandise){
			if(null!=merchandise.getId()){
				criteria.add(Restrictions.eq("id", merchandise.getId()));
			}
			if(null!=merchandise.getCode()&& merchandise.getCode().trim().length()>0){
				criteria.add(Restrictions.eq("code", merchandise.getCode()));
			}
			if(null!=merchandise.getName()&& merchandise.getName().trim().length()>0){
				criteria.add(Restrictions.like("name", merchandise.getCode(),MatchMode.ANYWHERE));
			}
			
		}
		return (List<Merchandise>) this.getHibernateTemplate().findByCriteria(criteria);
	}

	public void saveOrUpdateMerchandise(Merchandise merchandise) {
		Merchandise emp=this.getHibernateTemplate().get(Merchandise.class, merchandise.getId());
		emp.setCode(merchandise.getCode());
		emp.setName(merchandise.getName());
		emp.setPrice(merchandise.getPrice());
		this.getHibernateTemplate().update(emp);	
		
	}

	public void delMerchandiseById(int parseInt) {
		Merchandise merchandise=this.getHibernateTemplate().get(Merchandise.class, parseInt);
	    this.getHibernateTemplate().delete(merchandise);
		
	}

	public List<Merchandise> findMerchandiseById(Integer id) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Merchandise.class);
		if(null!=id){
				criteria.add(Restrictions.eq("code", id));
		}
		return (List<Merchandise>) this.getHibernateTemplate().findByCriteria(criteria);
	}

	public void saveMerchandise(Merchandise merchandise) {
		this.getHibernateTemplate().save(merchandise);
	}

}
