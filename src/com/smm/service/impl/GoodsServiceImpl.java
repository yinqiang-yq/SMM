package com.smm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.smm.dao.GoodsDao;
import com.smm.entity.GoodsEntity;
import com.smm.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	
	@Resource
	GoodsDao dao;
	
	@Override
	public List<GoodsEntity> getAllGoods() {
		return dao.getAllGoods();
		// TODO Auto-generated method stub
		//return new ArrayList<GoodsEntity>();
	}

	@Override
	public GoodsEntity getSingleGoodsByID(int goodsID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addGoods(GoodsEntity goods) {
		
		return dao.addGoods(goods);
	}

	@Override
	public int delGoods(int ID) {
		// TODO Auto-generated method stub
		return 0;
	}

}
