package aug17;

class StringBufEx2{

	public static void main(String[] args){
		
		StringBuffer sb1 = new StringBuffer("Sun-Ae");
		StringBuffer sb2 = sb1.append(" & Kyung-Ju");

		String msg = null;
		String msg1 = null;
		String msg2 = null;
		if(sb1 == sb2)
			msg = "sb1�� sb2�� ����.";
		else
			msg = "sb1�� sb2�� �ٸ���.";
		System.out.println(msg);
		
		msg = sb1.toString();
		System.out.println("sb1 : " + msg);
		msg = sb2.toString();
		System.out.println("sb2 : " + msg);

		msg1 = sb1.toString();
		System.out.println("sb1 : " + msg);
		msg2 = sb2.toString();
		System.out.println("sb2 : " + msg);		
		
		if(msg1.equals(msg2))
		{
			System.out.println("���배��");
		}
		else
		{
			System.out.println("����ٸ���");			
		}
		
		
	}
}













