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

			System.out.println("번호키를 입력해주세요.");
			
	        @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성
			String temp = scan.nextLine();        // 키보드 숫자 정수 입력		
			
			
			if(Number_Value.equals(temp))
	        {
	        	System.out.println("문이 열렸습니다.");
	        	break;
	        }
	        else
	        {
	        	System.out.println("비밀번호가 틀렸습니다.");
	        }
		} while(true);
	}

}
