package aug10;
//���� ������.
class OperEx10{
	public static void main(String[] args){
		int a = 14;
		int b = 15;
		String c = "";
		String s = "ũ�� ";
//		s = ++a >= b ? c = "a�� ũ��" : c = "b�� ũ��.";
		s += ++a >= b ? (a == b?"�� �ƴ϶� ����": (a-b)+"��ŭ a��..") : (b-a)+"��ŭ b��..";
		//s = "ũ��" + 
		System.out.println(s);
	}
}