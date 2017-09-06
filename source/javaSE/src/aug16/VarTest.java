package aug16;

//Variable Arguments
class VarTest {
	//argTest()
	//argTest(String n)
	//argTest(String n,String n1)
	public void argTest(String ... n){ //�Ű������� ������ ������ ���� �ʴ´�...!!! (zero or unlimited)
		for(int i = 0 ; i < n.length ; i++)
			System.out.println("n["+i+"]:"+n[i]);
		System.out.println("--------------------------");
	}
	public static void main(String[] args){
		VarTest vt = new VarTest(); //��ü����
		vt.argTest("Varargs","Test");
		
		vt.argTest("100","600","900","1000");
		vt.argTest();
	}
}

//VarTest
//======
//arfTest()