package aug17;

class StringEx5{

	public static void main(String[] args){
		String s1 = "Kwon Sun Ae";
		         //  012345678910
		int index = s1.indexOf('n'); //3
		System.out.println("�� ó�� ���� n�� ��ġ : " + index);

		index = s1.indexOf("Sun");//5
		System.out.println("���� Sun�� ��ġ : " + index);

		index = s1.lastIndexOf('n');//7
		System.out.println("������ ���� n�� ��ġ : " + index);

		char c = s1.charAt(index); //���� ���� n
		System.out.println("������ ���� : "+ c);
		
		/*String s1 = "Kwon Sun Ae";
        //             012345678910
*/		
		index = s1.indexOf('S');//5
		String str = s1.substring(index);//Sun Ae
		System.out.println("�빮�� S�κ��� ������ �߶󳻱� : "+str);

		str = s1.substring(index, index+3);//Sun
		System.out.println("�빮�� S�κ��� 3�ڱ��� �߶󳻱� : "+str);

		int length = s1.length();//11
		System.out.println("s1�� ���� : " + length);

		String[] arr = s1.split(" ");
		for(int i = 0 ; i < arr.length ; i++)
			System.out.println("arr["+i+"] : "+arr[i]);
	}
}












