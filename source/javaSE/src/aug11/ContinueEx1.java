package aug11;

class ContinueEx1 {
	public static void main(String[] args) {

		for(int i = 1 ; i <= 1000 ; i++){
			if(i%2 == 0) //2�� ���
				continue;
			System.out.println("i��:"+i);
		}
	}
}
//0~9������ ���ڿ��� 4�� ����� ������
//���ڸ� ��� ===> continue