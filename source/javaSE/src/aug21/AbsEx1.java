package aug21;

//�߻� Ŭ������ �Ϲ� ����, �޼���, ��� ��� ���� �� �ִ�.
//������ �߻�޼��带 �ϳ��� ���� ��츦 ���Ѵ�.
abstract class AbsEx1{
	int a = 100; //����
	final String str = "abstract test"; //���
	public String getStr(){ //�Ϲ� �޼���
		return str;
	}

	// �߻� �޼��� : ��ü�� ����.{}���� ����....
	abstract public int getA();
}
