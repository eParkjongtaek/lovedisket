package aug23;

import java.util.Scanner;

public class jinbub {
	public static void main(String [] args)
	{
		int numeric;
		
		System.out.println("진법 변환할 2진수를 입력해주세요.");
		
		Scanner scan = new Scanner(System.in);
		
		// 2진수만 입력받는다
	    while (!scan.hasNextInt(2)) {
	    	scan.next(); // 에러일 경우, 방금 입력받은 값 무시
	        System.err.print("에러! 올바른 2진수를 다시 입력바랍니다: ");
	    }				
		
	    // 정수형 대입
		numeric = scan.nextInt(); 		
		
		// 16진수 변환
		String numeric16 = Integer.toHexString(numeric);		
		// 8진수 변환
		String numeric8 = Integer.toOctalString(numeric);	
		// 10진수 변환
		String numeric10 = Integer.toString(numeric);
		
		int numeric10_convert = Integer.parseInt(numeric10, 2);
		
		System.out.println("16진수 변환 = " + numeric16.toUpperCase());
		System.out.println("8진수 변환 = " + numeric8);
		System.out.println("10진수 변환 = " + numeric10_convert);
		
	}
}