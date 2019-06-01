package sss;

import java.util.ArrayList;
import java.util.List;


public class StudentManagement {
	//属性
	List<Student> list=new ArrayList<Student>();
	//方法
	
	//添加单个学生
	public void addStu(Student s){
		list.add(s);
	}
	//查询单个学生  根据编号来查询
	public void queryOneStu(int id){
		System.out.println(list.get(id));
	}
	//查询所有学生
	public void queryALLStu(){
		for(Student stu:list){
			System.out.println(stu);
		}
	}
	//删除单个学生   根据编号来删除
	public void deleteStu(int id){
		list.remove(id);
	}
	//修改单个学生   根据编号来修改属性name  newname为修改之后的新name
	public void updateStu(int id,String newname){
			list.get(id).setName(newname);
	}

}
