package aug16;

//call by reference : �޼��忡 ���޵� �Ű������� ������ �Ű����� ���� ����ȴ�.....
class ReferenceParameter{	
	public void increase(int[] n){ //n = ref1 : ref1�̶�� �迭�� ����Ű�� ��ü�� n�̶�� �迭�� 
	                                       //              ����Ų��.....
		for(int i = 0 ; i < n.length ; i++){ //�迭�� ó��n[0]���� �迭�� ũ��n[n.length-1]��ŭ �ݺ�
			n[i]++; //i��° �迭�ǰ��� 1��ŭ����
			System.out.println("n["+i+"] : "+ n[i]);
		}
	}
	public static void main(String[] args){
		int[] ref1 = {100,800,1000}; //ref1.length = 3
		ReferenceParameter rp = new ReferenceParameter(); //��ü����
		rp.increase(ref1);
		for(int i = 0 ; i < ref1.length ; i++)
			System.out.println("ref1["+i+"] : "+ ref1[i]);
	}
}

//ReferenceParameter
//=============
//increase(int[] n)
//�迭
//int[] a = new int[5];
//int[] a = {1,2,3,4,5};
//a[0]=1 a[1]=2














