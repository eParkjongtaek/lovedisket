package aug10;
//���� ������
class OperEx9{
	public static void main(String[] args){
		int a = 10;
		int b = 15;
		String s = "ũ�� ";

		s += (++a >= b) ? (a-b)+"��ŭ a��.." : (b-a)+"��ŭ b��..";
		//s = s + (++a >= b) ? (a-b)+"��ŭ a��.." : (b-a)+"��ŭ b��..";
		//       "ũ�� " + 4+"��ŭ b��.."
		System.out.println(s);

		
		/*if (++a>=b)
		{
			System.out.println(s+(a-b)+"��ŭ a��..");
		}
		else
		{
			System.out.println(s + (b-a)+"��ŭ b��..");
		}*/

	}
}











