package aug25.list;


import static java.lang.System.out;
import java.util.Vector;

class VectorEx1{

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>(2,5);
		
		out.println("::::::::::::Vector������:::::::::::::");
		out.println("capacity : "+v.capacity ()); //2
		out.println("size : "+v.size ()); //0

		//�ڿ��߰�
		v.add("������");
		v.add("���ֿ�");
		v.addElement("����ö");

		out.println("::::::::::::��� �߰���::::::::::::::");
		out.println("capacity : "+v.capacity ()); //7
		out.println("size : "+v.size ()); //3
	}
}












