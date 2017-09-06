package aug14;
import javax.swing.*;             // JOptionPaneŬ������ ����ϱ� ���ؼ� ���. 

class Game
{
	String lotto()
	{

		int lottoList[] = new int[6];
		int index = 0;
		String lottoNum = "";
		
	
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
	    	
	    	lottoNum = lottoNum + lottoList[z] + "\t";
	    	
	    }		
		
		return lottoNum;		
	}
	
	void numberGame()
	{
		// 1~100������ �����ǰ��� �� answer�� �����Ѵ�. 
		int answer = (int)(Math.random() * 100) + 1; 
		int input = 0;             // ������Է��� ������ ���� 
		String temp = "";         // ������Է��� ������ �ӽð��� 
		int count = 0;             // �õ�Ƚ���� �������� ���� 

		do { 
			count++; 
			temp = JOptionPane.showInputDialog("1~100������ ���ڸ� �Է��ϼ���."
			                                 + " �������� -1�� �Է��ϼ���."); 

             // ����ڰ� ��ҹ�ư�� �����ų� -1�� �Է��ϸ� do-while���� �����. 
			if(temp==null || temp.equals("-1")) break;       

			System.out.println("�Է°� : "+temp); 

			// ������Է��� ���ڿ��� �޾ƿ��� ������ int�� ��ȯ�� �־���Ѵ�. 
			input = Integer.parseInt(temp); 

			if(answer > input) { 
				System.out.println("�� ū ���� �Է��ϼ���."); 
			} else if(answer < input) { 
				System.out.println("�� ���� ���� �Է��ϼ���."); 
			} else { 
				System.out.println("������ϴ�.");                   
				System.out.println("�õ�Ƚ���� "+count+"�� �Դϴ�.");      
				break;             // do-while���� �����. 
			} 
		} while(true);             // ���ѹݺ��� 		
	}
}

public class Choice_Main {

	public static void main(String[] args) {
		
		String gameChoice = "";
		String resultSet = "";
		
		gameChoice = JOptionPane.showInputDialog("������ �����ϼ��� 1�� �ζ� 2�� ���ڸ��߱��Դϴ�."); 		
		
		Game gc = new Game();
			
		if(gameChoice.equals("1"))
		{
			resultSet = gc.lotto();	
			System.out.println(resultSet);
		}
		else if(gameChoice.equals("2"))
		{
			gc.numberGame();
		}
		else
		{
			System.out.println("�߸��� �����Դϴ�.");
		}
	}

}
