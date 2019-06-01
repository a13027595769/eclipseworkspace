package com.mypack.entity;

import java.util.Date;

public class Evaluate {
	int evaluateId;//���۱��
	String evaluateName;//������
	String content;//��������
	int score;//�Ǽ��÷�
	String evaluateDate;//��������ʱ��
	Goods good;//���۵���Ʒ����
	
	
	public Evaluate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Evaluate(int evaluateId, String evaluateName, String content,
			int score, String evaluateDate, Goods good) {
		super();
		this.evaluateId = evaluateId;
		this.evaluateName = evaluateName;
		this.content = content;
		this.score = score;
		this.evaluateDate = evaluateDate;
		this.good = good;
	}
	


	public Evaluate(String evaluateName, String content, int score,
			String evaluateDate, Goods good) {
		super();
		this.evaluateName = evaluateName;
		this.content = content;
		this.score = score;
		this.evaluateDate = evaluateDate;
		this.good = good;
	}



	public int getEvaluateId() {
		return evaluateId;
	}
	public void setEvaluateId(int evaluateId) {
		this.evaluateId = evaluateId;
	}
	public String getEvaluateName() {
		return evaluateName;
	}
	public void setEvaluateName(String evaluateName) {
		this.evaluateName = evaluateName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEvaluateDate() {
		return evaluateDate;
	}
	public void setEvaluateDate(String evaluateDate) {
		this.evaluateDate = evaluateDate;
	}
	public Goods getGood() {
		return good;
	}
	public void setGood(Goods good) {
		this.good = good;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}
	
	

}
