package aug10;

//데이터타입의 캐스팅예제
class OperEx2{
	public static void main(String[] args){
		byte a,b;
		a = b = 10;

		byte c = (byte)(a + b); //산술연산값은 언제나 int,double의 값이다 .
		System.out.println("c의 값 :" + c);
	}
}
