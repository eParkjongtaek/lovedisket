package aug17;

class CallStackTest {
	public static void main(String[] args) {
		//Ŭ������.����
		//Ŭ������.�޼���
		//���� Ŭ�������� static �޼��忡�� ȣ���Ҷ���
		//����,�޼������ �״�� ����ؼ� ȣ���Ѵ�.
		firstMethod();
	}

	static void firstMethod() {
		secondMethod();
	}

	static void secondMethod() {
		System.out.println("secondMethod()");		
	}
}