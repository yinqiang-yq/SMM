package com.smm.dao;

import java.util.*;

import com.smm.entity.GoodsEntity;

/**
 * Goods数据访问接口
 * @author yin
 */
public interface GoodsDao {
	
	/**
	 * 获取所有商品
	 * @return 返回商品实体列表
	 */
	List<GoodsEntity> getAllGoods();
	
	/**
	 * 通过GoodsID获取商品
	 * @param goodsID 商品ID
	 * @return 返回商品实体
	 */
	GoodsEntity getSingleGoodsByID(int goodsID);
	
	/**
	 * 添加商品
	 * @param goods 商品实体
	 * @return 返回影响行数 
	 */
	int addGoods(GoodsEntity goods);
	
	/**
	 * 通过ID删除商品
	 * @param ID
	 * @return
	 */
	int delGoods(int ID);
}
