package aug18;

//�����迭(������ �������� ���� ���¿���.....)
class ObjArrayEx6
{
	public static void main(String[] args) 
	{
		int[] t1 = {1,100}; //���̰� 2���� 1���� �迭 ����� ����
		int[] t2 = {20,200,2000,20000}; //���̰� 4���� 1���� �迭 ����� ����
		
		int[][] test = new int[2][];// ����� ���� , �����迭
		test[0] = t1; // ù��° �࿡ �غ��� 1���� �迭 ���� test[0]��쿡�� 2���� ���� 2
		test[1] = t2; // �ι�° �࿡ �غ��� 1���� �迭 ���� test[1]             2              4
		//    test[0]     test[1]
		//       l              l
		//    1,100       20,200,2000,20000

		for(int i = 0 ; i < test.length ; i++) //2
		{
			for(int j = 0 ; j < test[i].length ; j++)  //i=0 2, i=1 4
				System.out.println("test["+i+"]["+j+"]:"+test[i][j]);
			System.out.println("-----------------");

		}
	}
}








