package jun23;

//비교연산자
class OperEx4{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		boolean c = a < b; //변수 a가 변수 b보다 작다.
		System.out.println("a < b :" + c);
		
		c = (a <= b); 
		System.out.println("a <= b :" + c);
		
		c = (a > b); 
		System.out.println("a > b :" + c);
		
		c = (a >= b); 
		System.out.println("a >= b :" + c);
		
		c = (a == b); 
		System.out.println("a == b :" + c);

		c = (a != b); //변수 a와 변수 b는 같지 않다.
		System.out.println("a != b :" + c);
	}
}










