package aug21;

class CellPhone {

	String model; //�������
	String number; //�������
	int chord; //�������

//setXXX() : �������ó���
//getXXX() : ���������� ����
//isXXX() : ����Ÿ���� boolean���̴�......

	protected void setNumber(String n){
		number = n;
	}
	public String getModel(){
 		return model;
	}
	public int getChord(){
		return chord;
	}
	public String getNumber(){
		return number;
	}
}
