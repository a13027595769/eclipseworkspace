package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Goods;

public interface GoodsDaoIF {
	
	public Goods queryGoodsById(int goodsId);//��ѯ���� 
	public List<Goods> queryAllGoods() ;//��ѯ����

}
