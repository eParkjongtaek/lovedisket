package aug23;

class AutoboxingEx2 {

	Integer var;
	public void setInt(int i){
		var = i;	//����ڽ�
	}
	public Integer getInt(){
		return var;
	}
	public static void main(String[] args){
		AutoboxingEx1 a1 = new AutoboxingEx1();
		a1.setInt(10000);
		int res = a1.getInt(); //��ڽ�
		System.out.println("res :"+res);
	}
}//����Ŭ������ �⺻������Ÿ�԰����� ����....













