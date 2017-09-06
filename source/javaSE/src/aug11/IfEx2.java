package aug11;

//기본 if문
class IfEx2 {
	public static void main(String[] args) {
		
		int su1 = Integer.parseInt(args[0]);
		String str;

		if(su1 >= 50)   //기본조건(true)
			str = "50이상";  //조건이 참일때 실행하는 실행문
		else //기본조건(false)
			str = "50미만";  //조건의 결과가 거짓일때 실행
			                      //하는 실행문....

		System.out.println(str+"입니다.");
	}
}
