package annotation;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
	/*
	 * 
	 java5��ʼ��java��ʼ��Ԫ���ݵ�֧�֣�Ҳ����annotation(ע��/��ǩ)
	 ���е�annotation��java.lang.annotation.Annotation�ӿڵ��ӽӿڣ�����Annotation��һ������Ľӿ�(
	 ö��Ҳ���������)
	 ʹ��ע�⣬��ǩAnnotation����һ�塣
	 ʹ��ע�ⱻ����Ϊ����Ԫ��(�࣬��������Ա������)����Ԫ����
	 ע�⣬��ǩ��Annotation����һ��
	 -------------------------------
	 ʹ��ע����Ҫע�⣬�����е����������������
	 1������ע���ǩ��
	 2��������	����Ԫ��(�࣬�ֶΣ���������������)
	 3���ɵ������ĳ���������ע������Ĺ���(Ҳ����java����)
	 */
	/*
	 * @Override �޶���д����ķ���
	 * @Deprecated ����Թ�ʱ ���Ƽ�ʹ��
	 * @SuppressWarnings(Value = "all")���Ʒ����ľ���
	 */
	
	public static void main(String[] args) {
		@SuppressWarnings(value ="all")
		Set set = new HashSet();
	}
}
