package aug21;

class Parent2{
	
	public Parent2(int a){
		System.out.println("Parent Ŭ����");
	}
}
class SuperEx extends Parent2 {
	public SuperEx() {   //Parent()  
		super(1);
		System.out.println("SuperEx Ŭ����"); 
	}

	public static void main(String[] args) {
		SuperEx se = new SuperEx(); 
	}
}

//SuperŬ������ �����ڰ� ������� ȣ��ȴ�. 
//SubŬ������ �����ڵ� ȣ��ȴ�.....