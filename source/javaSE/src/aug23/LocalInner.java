package aug23;

class LocalInner {
	int a = 100;//��� ����	
	
	public void innerTest(int k){
		int b = 200;// ��������
		final int c = k; //���
		
		class Inner{
			// Local ���� Ŭ������ �ܺ�Ŭ������ ��� ������
			// ����鸸 ������ �����ϴ�.
			public void getData(){
				System.out.println("int a : "+a);
				//System.out.println("int b : "+b);//Local ����Ŭ������
				// ���������� ����� �� ����.
				System.out.println("final int c : "+c);//��� ���
			}
		}
		Inner i = new Inner();//�޼��峻���� Local ���� Ŭ���� ����
		i.getData();//������ reference�� ���� �޼��� ȣ��
	}
	public static void main(String[] args) {
		LocalInner outer = new LocalInner();
		outer.innerTest(1000);//�ܺ� Ŭ������ ��� �޼��� ȣ��
	}
}















