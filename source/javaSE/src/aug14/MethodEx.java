package aug14;

class MethodEx {
	int var1,var2; //���������(��������)
	
	//public MethodEx(){}
	
	public int sum(int a, int b){ //����޼���
	//���������� ����Ÿ�� �޼ҵ��(�Ű�����1,�Ű�����2)		
		return a+b;
	}
	public static void main(String[] args){		
		MethodEx me = new MethodEx(); //��ü�� ����
		int res = me.sum(1000, -10);//�޼��� ȣ�� ===>������������
		System.out.println("res="+res);
	}
}

//MethodEx
//...............
//int var1,var2
//...............
//sum()













