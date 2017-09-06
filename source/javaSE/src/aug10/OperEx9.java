package aug10;
//삼항 연산자
class OperEx9{
	public static void main(String[] args){
		int a = 10;
		int b = 15;
		String s = "크다 ";

		s += (++a >= b) ? (a-b)+"만큼 a가.." : (b-a)+"만큼 b가..";
		//s = s + (++a >= b) ? (a-b)+"만큼 a가.." : (b-a)+"만큼 b가..";
		//       "크다 " + 4+"만큼 b가.."
		System.out.println(s);

		
		/*if (++a>=b)
		{
			System.out.println(s+(a-b)+"만큼 a가..");
		}
		else
		{
			System.out.println(s + (b-a)+"만큼 b가..");
		}*/

	}
}











