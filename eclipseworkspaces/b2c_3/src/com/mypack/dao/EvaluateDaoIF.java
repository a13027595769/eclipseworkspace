package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Evaluate;


public interface EvaluateDaoIF {

	
	public boolean addEvaluate(Evaluate evaluate);
	//һ����Ʒ��Ӧ�Ը���������
	public List<Evaluate> queryAllEvaluateByGoodsId(int goodsId);

	
}