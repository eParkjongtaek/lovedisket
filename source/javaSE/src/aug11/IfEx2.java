package aug11;

//�⺻ if��
class IfEx2 {
	public static void main(String[] args) {
		
		int su1 = Integer.parseInt(args[0]);
		String str;

		if(su1 >= 50)   //�⺻����(true)
			str = "50�̻�";  //������ ���϶� �����ϴ� ���๮
		else //�⺻����(false)
			str = "50�̸�";  //������ ����� �����϶� ����
			                      //�ϴ� ���๮....

		System.out.println(str+"�Դϴ�.");
	}
}
