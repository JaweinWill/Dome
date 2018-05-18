package com.zds.slms.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zds.slms.domain.Client;

public class ClientDao extends HibernateDaoSupport implements IClientDao{
	public List<Client> findClient(Client client) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Client.class);
		if(null!=client){
			if(null!=client.getCode()&& client.getCode().trim().length()>0){
				criteria.add(Restrictions.eq("code", client.getCode()));
			}
			if(null!=client.getName()&& client.getName().trim().length()>0){
				criteria.add(Restrictions.like("name", client.getCode(),MatchMode.ANYWHERE));
			}
			
		}
		return (List<Client>) this.getHibernateTemplate().findByCriteria(criteria);
	}
	/**
	 * 
	 * @param client  只根据编号来查
	 * @return 查找的对象
	 */
	public List<Client> findClientById(String code) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Client.class);
		if(null!=code){
				criteria.add(Restrictions.eq("code", code));
		}
		return (List<Client>) this.getHibernateTemplate().findByCriteria(criteria);
	}
	

	/**
	 * 将Client对象中的数据写入数据库，完成员工信息增加功能
	 * @param client 封装了要写入数据库的Client对象
	 */
	@Override
	public void saveClient(Client client) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(client);
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
				this.getHibernateTemplate().save(client);
		
	}
	@Override
	public void saveOrUpdateClient(Client client) {
		Client cli=this.getHibernateTemplate().get(Client.class, client.getId());
		cli.setCode(client.getCode());
		cli.setName(client.getName());
		cli.setAddress(client.getAddress());
		cli.setTelephone(client.getTelephone());
		cli.setEmail(client.getEmail());
		this.getHibernateTemplate().update(cli);	
	}
	@Override
	public void delClientById(int clientId) {
		Client client=this.getHibernateTemplate().get(Client.class, clientId);
	    this.getHibernateTemplate().delete(client);
	}

}
