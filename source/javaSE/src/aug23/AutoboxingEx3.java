package aug23;

class AutoboxingEx3 {
	
	public static void main(String[] args){
		Integer[] var = {new Integer(100),200,300};

		for(int i : var) //��ڽ�
			System.out.println(i);
	}
}
