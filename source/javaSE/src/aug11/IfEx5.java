package aug11;

class IfEx5 {
	public static void main(String[] args) {

        int jumsu = Integer.parseInt(args[0]);
        //java Ȯ���ڸ��������̸� ������μ�1.............
		String res;
	
		if(jumsu >= 90 && jumsu <= 100)
			res = "A����";
		else if(jumsu >= 80 && jumsu <90)
			res = "B����";
		else if(jumsu >= 70 && jumsu <80)
			res = "C����";
		else if(jumsu >= 60 && jumsu <70)
			res = "D����";
		else if(jumsu >= 50 && jumsu <60)
			res = "E����";
		else
			res = "�׾��....FFFFFFFFFF";

		System.out.println(res);
	}
}

//java IfEx4 �ޱ�