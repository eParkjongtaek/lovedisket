package aug21;

class Parent {	
	String msg = "ParentŬ����";
	public String getMsg(){
		return msg;
	}
}

class Child extends Parent{
	String msg = "ChildŬ����";
	public String getMsg(){ //�������̵�.....
		return msg;
	}
}

public class OverridingEx {
	public static void main(String[] args){

		Child cd = new Child();
		System.out.println("cd : "+cd.getMsg());  //Child Ŭ����
		//�߻�Ŭ����,�������̽�
		Parent pt = new Child();  //ó������ ��ü���� (�θ�Ŭ���� ��ü�� = new �ڽ�Ŭ����())
		System.out.println("pt : "+pt.getMsg());  //ChildŬ����
        //Child cc = new Parent();
		Parent ct = new Parent();
		System.out.println("cd : "+ct.getMsg());  //Parent Ŭ����
	}
}










