package aug23;

interface TestInter{
	int data = 10000;
	public void printData();
}
class  AnonyInner{

	public void test(){
		//�߻�Ŭ������ �������̽��� �ڻ����� ���� ������
		//�̿ϼ��� �ڿ�(�߻�޼���)�� �����Ƿ�
		//JVM�� �޸𸮻� � ���·� �ڿ��� ��ġ���� 
		//�𸣱� �����̴�.
		new TestInter(){
			public void printData()//�̿ϼ��� ���� �ϼ��Ͽ�
			{			//JVM�� Ȯ�ΰ����ϵ��� ���ش�.
				System.out.println("data : "+data);
			}
		}.printData();
		
		/*TestInter2 tt = new TestInter2();
		tt.printData();*/

	}
	public static void main(String[] args){
		//AnonyInner ai = new AnonyInner();
		//ai.test();
		new AnonyInner().test();//�͸����� ����
	}
}

/*class TestInter2 implements TestInter{
	public void printData()//�̿ϼ��� ���� �ϼ��Ͽ�
	{			//JVM�� Ȯ�ΰ����ϵ��� ���ش�.
		System.out.println("data : "+data);
	}
}*/






