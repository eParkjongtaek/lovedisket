package aug18;

class ObjArrayEx3 {
	public static void main(String[] args){
		String[] arr = {"����","��","����"};  //arr.length=3
		
		/*for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);*/
		//������ loop
		for(String s : arr) //arr�̶�� 0��° �ε����� �ش�Ǵ� ������ �����ͼ� s��� ������ �����ض�!!!
			System.out.println(s);
	}
}
