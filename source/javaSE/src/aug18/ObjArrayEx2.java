package aug18;

class ObjArrayEx2 {
	public static void main(String[] args){
		
		String[] arr; //��ü���迭 ����
		
		if(args.length > 0) {//�����Ҷ� ������μ��� �־���ٸ�....
			arr = args; //args�� ����Ű�� �ִ� Heap�����޸��� �ּҸ� arr�� ����Ű���� �����Ѵ�.
			                //�޸��ּҰ� ����
			for(int i = 0 ; i < arr.length ; i++)
				System.out.println("arr["+i+"]:"+arr[i]);
		}else
			System.out.println("args�� ������ �����ϴ�.");
	}
}
