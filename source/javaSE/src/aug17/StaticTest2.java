package aug17;

class StaticTest2_1{

	String s1 = "static"; //instance
	static String s2 = "STATIC"; //static

	public static String getString(){ //static
		return s2; // ���⼭ ���� s1�� return�ϸ� ����!
	}
}
////////////////////////////////////////////////////////////
class StaticTest2 {

	public static void main(String[] args){
		System.out.println("s1 : " + StaticTest2_1.getString());
	}
}









