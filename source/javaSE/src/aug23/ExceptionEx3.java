package aug23;

  import static java.lang.System.out;
  class ExceptionEx3 {

	public static void main(String[] args) {
		int var = 50;
		try{
			int data = Integer.parseInt(args[0]);		
			out.println(var/data);
		}catch(NumberFormatException ne){
			out.println("���ڰ� �ƴմϴ�.");
		}catch(ArithmeticException ae){
			out.println("0���� ������ ����?");
		}catch(ArrayIndexOutOfBoundsException ae){
			out.println("�迭�� �Ѿ����ϴ�.");
		}
		out.println("���α׷� ����!");
	}
  }
