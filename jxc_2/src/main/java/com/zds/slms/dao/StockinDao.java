package com.zds.slms.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.opensymphony.xwork2.ActionSupport;
import com.zds.slms.domain.Client;
import com.zds.slms.domain.Merchandise;
import com.zds.slms.domain.Stockin;

public class StockinDao extends HibernateDaoSupport implements IStockinDao {

	private MerchandiseDao merchandiseDao;
	private ClientDao clientDao;
	private EmployeeDao employeeDao;

	public MerchandiseDao getMerchandiseDao() {
		return merchandiseDao;
	}

	public void setMerchandiseDao(MerchandiseDao merchandiseDao) {
		this.merchandiseDao = merchandiseDao;
	}

	@Override
	public List<Stockin> findStockin(Stockin stockin) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Stockin.class);
		/*
		 * Stockin [id=null, code=, merchandise=Merchandise [id=1, code=null, name=null, price=null], client=Client [id=2, code=null, name=null, address=null, telephone=null, email=null], employee=Employee [id=33, code=null, name=null, birthday=null, sex=null, telephone=null, email=null], amount=null, price=null, money=null, stockindate=]
Merchandise [id=1, code=null, name=null, price=null]
Client [id=2, code=null, name=null, address=null, telephone=null, email=null]
Employee [id=33, code=null, name=null, birthday=null, sex=null, telephone=null, email=null]
		 */
		if (null != stockin) {
			if (null != stockin.getId()) {
				criteria.add(Restrictions.eq("id", stockin.getId()));
			}
			if (null != stockin.getCode() && stockin.getCode().trim().length() > 0) {
				criteria.add(Restrictions.eq("code", stockin.getCode()));
			}
			if (null != stockin.getMerchandise()) {
				if (null != stockin.getMerchandise().getId()) {
					criteria.add(Restrictions.eq("merchandise.id", stockin.getMerchandise().getId()));
				}
			}
			if (null != stockin.getClient()) {
				if (null != stockin.getClient().getId()) {
					criteria.add(Restrictions.eq("client.id", stockin.getClient().getId()));
				}
			}
			if (null != stockin.getStockindate() && stockin.getStockindate().trim().length() > 0) {
				criteria.add(Restrictions.eq("stockindate", stockin.getStockindate()));
			}
			if (null != stockin.getEmployee()) {
				if (null != stockin.getEmployee().getId()) {
					criteria.add(Restrictions.eq("employee.id", stockin.getEmployee().getId()));
				}

			}
		}
		return (List<Stockin>) this.getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public void saveStockin(Stockin stockin) {
		System.out.println("********************************");
		System.out.println(stockin);
		/*
		 * Stockin [id=null, code=5021, merchandise=Merchandise [id=3, code=null, name=null,
		 *  price=null], client=Client [id=2, code=null, name=null, address=null, 
		 *  telephone=null, email=null], employee=Employee [id=34, code=null, name=null,
		 *   birthday=null, sex=null, telephone=null, email=null], amount=100, price=3.0,
		 *    money=300.0, stockindate=2018-05-08]
		 * 
		 */
//		Merchandise merchandise = new Merchandise();
//		merchandise.setId(stockin.getMerchandise().getId());
//		stockin.setMerchandise(merchandiseDao.findMerchandise(merchandise).get(0));
		this.getHibernateTemplate().save(stockin);

	}

	@Override
	public void saveOrUpdateStockin(Stockin stockin) {
		Stockin b_stockin=this.getHibernateTemplate().get(Stockin.class, stockin.getId());
		b_stockin.setCode(stockin.getCode());
		b_stockin.setAmount(stockin.getAmount());
		b_stockin.setMoney(stockin.getMoney());
		b_stockin.setPrice(stockin.getPrice());
		b_stockin.setMerchandise(merchandiseDao.findMerchandise(stockin.getMerchandise()).get(0));
		b_stockin.setClient(clientDao.findClient(stockin.getClient()).get(0));
		b_stockin.setEmployee(employeeDao.findEmployee(stockin.getEmployee()).get(0));
		this.getHibernateTemplate().saveOrUpdate(b_stockin);	
	}

	public ClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void delStockinById(Integer parseInt) {
		Stockin stockin=this.getHibernateTemplate().get(Stockin.class, parseInt);
	    this.getHibernateTemplate().delete(stockin);	
	}
}
