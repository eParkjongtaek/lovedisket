package aug16;

class Data { 
	int x;
	
	static void change(int x) {  // �⺻�� �Ű�����
		x = 1000;
		System.out.println("change() : x = " + x);//1000
	}
}

class ParameterTest {
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); //10

		Data.change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	
}















