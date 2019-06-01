package com.mypack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mypack.entity.Evaluate;
import com.mypack.entity.Goods;
import com.mypack.entity.Item;
import com.mypack.util.DateUtil;



public class EvaluateDaoImpl extends BaseDao implements EvaluateDaoIF{

	@Override
	public boolean addEvaluate(Evaluate evaluate) {
		boolean flag=false;
		//ע�⣺ ���ʱ���������ظ�
		String sql="insert into evaluate(evaluateName,content,score,date,goodsId) values (?,?,?,?,?)";
		//2. ��������
		Connection conn=null;
		//3. ��������Sql����Statement
		PreparedStatement pstmt=null;
		//4. ִ��sql��
		//executeQuery(String sql) ִ�в�ѯ  executeUpdate(String sql) ִ����ɾ��
		//��ɾ��û��ResultSet
		try {
			
			conn =getConn();
			pstmt = conn.prepareStatement(sql);
			//ִ�����֮ǰ��sql����������ֵ
			
			pstmt.setString(1, evaluate.getEvaluateName());
			pstmt.setString(2, evaluate.getContent());
			pstmt.setInt(3, evaluate.getScore());
			pstmt.setString(4,evaluate.getEvaluateDate() );
			pstmt.setInt(5, evaluate.getGood().getGoodsId());
			
			int row=pstmt.executeUpdate();
			 
			if(row>0){
				
				System.out.println("�����"+row+"��");
				flag=true;
				
			}
		}  catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			close(pstmt, conn);
			
		}
		return flag;
	}

	@Override
	public List<Evaluate> queryAllEvaluateByGoodsId(int goodsId) {

		String sql="select * from evaluate where goodsId=?";
		List<Evaluate> evaLst=new ArrayList<Evaluate>();
		Connection conn=this.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, goodsId);
			rs=pstmt.executeQuery();
			while(rs.next()){
				int evaId=rs.getInt(1);
				String evaName=rs.getString(2); 
				String content=rs.getString(3);
				int score=rs.getInt(4);
			    String evaDate=rs.getString(5);
			    int gId=rs.getInt(6);
			      
			
				Goods good=new Goods(); 
				good.setGoodsId(gId);
				
				Evaluate eva=new Evaluate(evaId, evaName, content, score, evaDate, good);
				evaLst.add(eva);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			
			close(rs, pstmt, conn);
		}
		return evaLst;
	}

	
}