package aug11;

class IfEx4 {
	public static void main(String[] args) {

		String data = args[0];  
                   
		String res;
	
		if(data == "����") 
			res = "�޴�.";
		else if(data.equals("����"))
			res = "�ÿ��ϴ�.";
		else if(data.equals("����"))
			res = "���ִ�.";
		else
			res = "��Ÿ";

		System.out.println(res);
	}
}

//java IfEx4 �ޱ�