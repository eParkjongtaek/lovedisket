package aug25.list;

import java.util.*;
import static java.lang.System.out;
class IteratorEx1{

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,5);

		v.add("����");
		v.add("����");
		v.add("����");
		out.println("����ũ��:"+v.size());

		Iterator<String> it = v.iterator(); // Iterator���
		while(it.hasNext()){
			out.println(it.next());
			it.remove(); // ���� �÷��ǿ��� ��� ����
		}
//		it.remove();
		
		out.println("����ũ��:"+v.size());
	}
}





























