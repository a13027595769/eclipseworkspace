package LinkedLIstDemo;

public class Demo1 {
	private Node first;//����ĵ�һ���ڵ�
	
	private Node last;//��������һ���ڵ�
	
	private int size;//�ڵ������
	
	public boolean search(Object ele) {
		Node current = this.first;
		for(int i=0;i<size;i++) {
			if(!current.ele.equals(ele)) {
				if(current.next==null) {
					return false;
					}
			current = current.next;
			}
		}
		return true;
		
	}
	public void delete(Object ele) {
		Node current = this.first;
		for(int i=0;i<size;i++) {
			if(!current.ele.equals(ele)) {
				if(current.next==null) {
					return;
					}
			current = current.next;
			}
		}
		
		//ɾ���ڵ�
		//System.out.println("current = "+current.ele);
		if(current == first) {
			this.first = current.next;
			this.first.prev = null;
		}else if(current == last) {
			this.last=current.prev;
			this.last.next = null;
		}
		else {
			current.prev.next = current.next;
			current.next.prev =	current.prev;
		}
		size--;
	
	}
	
	
	public void addFirst(Object ele) {
		
		Node node = new Node(ele);
		if(size==0) {
			this.first = node;
			this.last = node;  
		}
		else {
			//��֮ǰ��һ���ڵ���Ϊ�����ڵ����һ���ڵ�;
			node.next = this.first;
			
			this.first.prev = node;
			
			this.first = node;
		}
		
		
		size++;
	}
	
	
	public void addLast(Object ele) {
		//��Ҫ����Ľڵ����
		Node node = new Node(ele);
		
		if(size==0) {
		//����ڵ������Ϊ0����ô�����ǵ�һ���ڵ�Ҳ�����һ���ڵ�
			this.first = node;
			this.last = node;
		}
		else {
			//�����ӵ�����ڵ������һ����ԭ�������һ����Ԫ�ص���һ���ڵ��Ӧ��������ڵ������
			this.last.next = node;
			//��ʱ����ӵ��½ڵ��ǰһ���ڵ����ԭ�������һ���ڵ�
			node.prev=this.last;
			//���ʱ��������ڵ�������һ���ڵ�
			this.last=node;
		}
		size++;
	}
	
	public String toString() {
		if(size==0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 +1);
		Node current = this.first;
		sb.append("[");
		for(int i=0;i<size;i++) {
			sb.append(current.ele);
			if( i != size-1) {
				sb.append(",");
			}
			else {
				sb.append("]");
			}
			current = current.next; 
			
		}
		return sb.toString();
		
	}
	
	
	
	//�����е�ÿһ���ڵ�
	class Node{
		Node prev;//��һ���ڵ����
		Node next;
		Object ele;
		public Node(Object ele) {
			this.ele = ele;
		}
		
		
	}



	
}
