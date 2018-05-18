package com.zds.slms.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zds.slms.domain.Merchandise;
import com.zds.slms.service.IMerchandiseService;

public class MerchandiseAction extends ActionSupport{
	private IMerchandiseService merchandiseService;
	private Merchandise merchandise;//用来接收前端发来的数据（要找的商品编号与名称）
	private List<Merchandise> merchandises;//集合用于存放查找所有商品对象
	private String[] sel;
	
	//查找商品
	public String findMerchandise(){
		merchandises=merchandiseService.findMerchandise(merchandise);
		System.out.println("查找商品"+merchandises);
		return "findMerchandise";
	}
	//修改
		public String saveOrUpdateMerchandise(){
			this.merchandiseService.saveOrUpdateMerchandise(merchandise);
			return "saveMerchandise";
		}

		//增加
		public String saveMerchandise(){
			this.merchandiseService.saveMerchandise(merchandise);
			return "saveMerchandise";
		};
		//删除
		public String delMerchandise(){
			if(sel!=null){
				for(String s:sel){
					System.out.println(s);
					this.merchandiseService.delMerchandiseById(Integer.parseInt(s));
				}
			}
			return "delMerchandise";
		}
		//负责根据编号查找相应merchandise对象
		public String updateMerchandise(){
			//1.根据编号（code）查找相应的对象
			merchandise=this.merchandiseService.findMerchandiseById(merchandise.getId()).get(0);
			return "updateMerchandise";
		}

	public IMerchandiseService getMerchandiseService() {
		return merchandiseService;
	}

	public void setMerchandiseService(IMerchandiseService merchandiseService) {
		this.merchandiseService = merchandiseService;
	}

	public Merchandise getMerchandise() {
		return merchandise;
	}

	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}

	public List<Merchandise> getMerchandises() {
		return merchandises;
	}

	public void setMerchandises(List<Merchandise> merchandises) {
		this.merchandises = merchandises;
	}

	public String[] getSel() {
		return sel;
	}

	public void setSel(String[] sel) {
		this.sel = sel;
	}
	
	

}
