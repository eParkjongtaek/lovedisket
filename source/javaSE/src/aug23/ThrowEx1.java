package aug23;

  import static java.lang.System.out;
  class ThrowEx1 {

	public void methodA(String[] n) throws Exception{
		if(n.length > 0){
			for(String s : n)
				out.println(s);
		}else
			throw new Exception("�迭�� ��Ұ� �����ϴ�.");
	}
	public static void main(String[] args) {
		ThrowEx1 te = new ThrowEx1();
		
		try{
			te.methodA(args);
		}catch(Exception e){
  		//out.println(e.getMessage());
			e.printStackTrace();
		}
	}
  }
