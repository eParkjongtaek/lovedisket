package jun23;
//비교 연산자
class OperEx6{
	public static void main(String[] args){
		int a = 10;  //00001010
		int b = 7;   //00000111
		//             ========
                     //00000010  ==.>2
		            // 00001111 ==>15
		            // 00001101 ==> 13

		int c = a & b;
		System.out.println("변수 c의 값 :"+c);
		
		c = a | b;
		System.out.println("변수 c의 값 :"+c);
		
		c = a ^ b;
		System.out.println("변수 c의 값 :"+c);
	}
}
// int(4Byte) ====> 32bit
// 00000000 00000000 00000000 11111111
// 128 64 32 16 8 4 2 1
// 00001111 ==> 8+4+2+1=15

























