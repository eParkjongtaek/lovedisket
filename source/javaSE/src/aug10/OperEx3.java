package aug10;

//���Կ�����
// a += 3   ===> a = a + 3
class OperEx3{
	public static void main(String[] args){
		int a = 10;
		int b = 7;

		System.out.println(a+b); //17
		System.out.println("���� a:"+a); //10
		

		System.out.println(a+=b); 
		//a = a + b; a =10+7=17
		System.out.println("���� a:"+a);//17
		
		System.out.println(a-=b);
		//a = a - b; a =17-7=10
		System.out.println("���� a:"+a);//10
		
		System.out.println(a*=b);		
		System.out.println("���� a:"+a);//70
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a/=b);		
		System.out.println("���� a:"+a);//10
		
		System.out.println(a%=b);		
		System.out.println("���� a:"+a);//3
	}
}