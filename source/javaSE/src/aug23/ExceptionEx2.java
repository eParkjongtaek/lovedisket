package aug23;

  import static java.lang.System.out;
  class ExceptionEx2 {

	public static void main(String[] args) {
		int[] var = {10,200,30};
		for(int i=0 ; i <= 3 ; i++){
			try{
				out.println("var["+i+"] : "+var[i]);
			}catch(ArrayIndexOutOfBoundsException ae){
				out.println("�迭�� �Ѿ����ϴ�.");
			}
		}//for�� ��

		out.println("���α׷� ��!");
	}
  }
