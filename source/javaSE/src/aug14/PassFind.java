package aug14;

import java.util.Scanner;

class PassCalculation
{
	String NumberFind()
	{
		int lottoList[] = new int[6];
		int lotto_answer[] = new int[6];
		int index = 0;
		String lottoNum = "";
		//String gameChoice1 = "";
	
		while(index != 6)
		{
			lottoList[index] = (int) (Math.random() * 45) + 1;
			for(int i = 0; i<index; i++)
			{
				if(lottoList[i] == lottoList[index])
				{
					index--;
					break;
				}
			}
			index++;
		}
		
		
	    for (int z = 0; z < lottoList.length; z++) 
	    {
	    	
	    	System.out.print(lottoList[z] + "\t");
	    	lottoNum = lottoNum + lottoList[z];
	    	lotto_answer[z] = lottoList[z];
	    	
	    }
	    
		return lottoNum;
	}
}

public class PassFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PassCalculation pf = new PassCalculation();
		String Number_Value = pf.NumberFind();
		
	       
		do
		{

			System.out.println("��ȣŰ�� �Է����ּ���.");
			
	        @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);      // ���� �Է��� ���ڷ� Scanner ����
			String temp = scan.nextLine();        // Ű���� ���� ���� �Է�		
			
			
			if(Number_Value.equals(temp))
	        {
	        	System.out.println("���� ���Ƚ��ϴ�.");
	        	break;
	        }
	        else
	        {
	        	System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
	        }
		} while(true);
	}

}
