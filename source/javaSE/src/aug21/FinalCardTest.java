package aug21;

class Card4 {
	final int NUMBER;		// ������� ����� �Բ� �ʱ�ȭ ���� �ʰ�
	final String KIND;		// �����ڿ��� �� �ѹ��� �ʱ�ȭ�� �� �ִ�.
	static int width = 100;	
	static int height = 250;

	Card4(String kind, int num) {	
		KIND = kind;
		NUMBER = num;
	}

	Card4() {
		this("HEART", 1);
	}

	public String toString() {
		return "" + KIND +" "+ NUMBER;
	}
}

class FinalCardTest {
	public static void main(String args[]) {
		Card4 c = new Card4("HEART", 10);
//		c.NUMBER = 5;	// ����!!! cannot assign a value to final variable NUMBER
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}
}












