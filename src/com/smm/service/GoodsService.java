package com.smm.service;

import java.util.List;

import com.smm.entity.GoodsEntity;

public interface GoodsService {
	
	/**
	 * ��ȡ������Ʒ
	 * @return ������Ʒʵ���б�
	 */
	List<GoodsEntity> getAllGoods();
	
	/**
	 * ͨ��GoodsID��ȡ��Ʒ
	 * @param goodsID ��ƷID
	 * @return ������Ʒʵ��
	 */
	GoodsEntity getSingleGoodsByID(int goodsID);
	
	/**
	 * �����Ʒ
	 * @param goods ��Ʒʵ��
	 * @return ����Ӱ������ 
	 */
	int addGoods(GoodsEntity goods);
	
	/**
	 * ͨ��IDɾ����Ʒ
	 * @param ID
	 * @return
	 */
	int delGoods(int ID);
}
