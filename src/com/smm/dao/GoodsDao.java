package com.smm.dao;

import java.util.*;

import com.smm.entity.GoodsEntity;

/**
 * Goods���ݷ��ʽӿ�
 * @author yin
 */
public interface GoodsDao {
	
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
