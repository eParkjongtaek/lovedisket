package aug11;

//단순 if문
class IfEx1 {
	
	public static void main(String[] args) {
		//parameter, argument, 매개변수, 인수, 인자...
		//명령줄 인수 : 실행을할때 넣어주는 인수
		//java 확장자를뺀클래스명 명령줄인수
		int su1 = Integer.parseInt(args[0]);
		String str = "50미만";

		if(su1 >= 50) //true
			str = "50이상";
		
		System.out.println(str+"입니다.");
		
	}
	
}






