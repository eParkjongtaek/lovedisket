package aug23;


public class TestInner {

     int i;

     public TestInner() {

          System.out.println("�ٱ�Ŭ���� ������");

     }// TestInner

     public void outMethod() {

          System.out.println("�ٱ�Ŭ������ �޼���");

     }

     // //////////Inner Class�� ����//////////////

     public class Inner {

          int j;

          public Inner() {

               System.out.println("����Ŭ������ ������");

          }// Inner

          public void inMethod() {

               System.out.println("����Ŭ������ �޼���");

               System.out.println("���ʸ޼��� �ٱ����� i="+i);

          }

     }// class

     // //////////Inner Class�� ��//////////////

     public static void main(String[] args) {

          TestInner ti = new TestInner();

          ti.i = 10;

          // ti.j=10;//���� Ŭ������ ������ ���� ��� �Ұ���

          // ti.inMethod(); //���� Ŭ������ �޼���� ���� ��� �Ұ���

          // �ٱ�Ŭ�������� ����Ŭ������ �ڿ��� ����Ϸ��� ����Ŭ������ 

          // ��üȭ�Ͽ� ���

          TestInner.Inner in = ti.new Inner();

          // ���� Ŭ������ �ڿ� ���

          in.j = 100;

          in.inMethod();

     }// main

}// class