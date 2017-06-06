package com.smm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smm.entity.GoodsEntity;
import com.smm.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	
	@Override
	public List<GoodsEntity> getAllGoods() {
		// TODO Auto-generated method stub
		return new ArrayList<GoodsEntity>();
	}

	@Override
	public GoodsEntity getSingleGoodsByID(int goodsID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addGoods(GoodsEntity goods) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delGoods(int ID) {
		// TODO Auto-generated method stub
		return 0;
	}

}
