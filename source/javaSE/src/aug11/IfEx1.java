package aug11;

//�ܼ� if��
class IfEx1 {
	
	public static void main(String[] args) {
		//parameter, argument, �Ű�����, �μ�, ����...
		//������ �μ� : �������Ҷ� �־��ִ� �μ�
		//java Ȯ���ڸ���Ŭ������ �������μ�
		int su1 = Integer.parseInt(args[0]);
		String str = "50�̸�";

		if(su1 >= 50) //true
			str = "50�̻�";
		
		System.out.println(str+"�Դϴ�.");
		
	}
	
}





