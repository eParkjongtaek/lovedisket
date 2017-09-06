package aug10;

public class OperatorEx1 
{
	int a; // 멤버변수, 전역변수
	
	
	public static void main(String args[]) 
   {
		int i=5; // local변수 지역변수
		//i++;		      // i=i+1;과 같은 의미이다. ++i;로 바꿔 써도 결과는 같다. 
		System.out.println(i++); //5
		i=5;		      //	결과를 비교하기 위해 i값을 다시 5로 변경.
		//++i; //6
		System.out.println(++i);//6
	}
}