package aug23;

import java.util.Scanner;

public class jinbub {
	public static void main(String [] args)
	{
		int numeric;
		
		System.out.println("���� ��ȯ�� 2������ �Է����ּ���.");
		
		Scanner scan = new Scanner(System.in);
		
		// 2������ �Է¹޴´�
	    while (!scan.hasNextInt(2)) {
	    	scan.next(); // ������ ���, ��� �Է¹��� �� ����
	        System.err.print("����! �ùٸ� 2������ �ٽ� �Է¹ٶ��ϴ�: ");
	    }				
		
	    // ������ ����
		numeric = scan.nextInt(); 		
		
		// 16���� ��ȯ
		String numeric16 = Integer.toHexString(numeric);		
		// 8���� ��ȯ
		String numeric8 = Integer.toOctalString(numeric);	
		// 10���� ��ȯ
		String numeric10 = Integer.toString(numeric);
		
		int numeric10_convert = Integer.parseInt(numeric10, 2);
		
		System.out.println("16���� ��ȯ = " + numeric16.toUpperCase());
		System.out.println("8���� ��ȯ = " + numeric8);
		System.out.println("10���� ��ȯ = " + numeric10_convert);
		
	}
}