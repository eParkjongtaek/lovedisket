package aug23;


public class TestLocal {

     int out_i;

     public TestLocal(){

          System.out.println("�ٱ� Ŭ������ ������");

     }//TestLocal    

     public void method(int param_i, final int param_j){

          int local_i=0;

          final int local_j=0;         

          ///////����Ŭ���� ����//////

          //�ٱ�Ŭ������$1����Ŭ������.class

        class Local{

             int i;

             public Local(){

                  System.out.println("����Ŭ������ ������");                 

             }//local

             public void localMethod(){

                  System.out.println("�ٱ�Ŭ������ �ν��Ͻ�����"+out_i);

                  

                  //final�� �پ����� ���� �Ķ���ʹ� ����Ŭ�������� ����� �� ����.

                  //System.out.println("�Ķ���� param_i="+param_i);

 

                  System.out.println("�Ķ���� param_j="+param_j); 

 

                  //final�� �پ����� ���� Ŭ������ ����Ŭ�������� ����� �� ����.                

                  //System.out.println("�������� local_i"+local_i);

 

                  System.out.println("�������� local_j="+local_j);

                  System.out.println("����Ŭ������ �޼ҵ�");                 

             }//localMethod

        }//class       

        Local local = new Local();

        local.i=10;

        local.localMethod();                

     }//method

     public static void main(String[] args) {         

          TestLocal tl = new TestLocal();

          tl.method(100,200);              

     }

}