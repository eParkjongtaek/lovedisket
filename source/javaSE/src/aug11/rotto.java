package aug11;
import java.io.IOException;
import java.util.Scanner;
//import javax.swing.*;             // JOptionPaneŬ������ ����ϱ� ���ؼ� ���. 

public class rotto {

	
	
	public static void main(String[] args) {
		
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
	    	lottoNum = lottoNum + lottoList[z] + "\t";
	    	lotto_answer[z] = lottoList[z];
	    	
	    }
	    
	    //gameChoice1 = JOptionPane.showInputDialog("ù��° �ζ� ���ڸ� �Է����ּ���."); 	    
	    
		// 1~100������ �����ǰ��� �� answer�� �����Ѵ�. 
		int temp = 0;         // ������Է��� ������ �ӽð��� 
		//int input = 0;             // ������Է��� ������ ���� 
		
	
	    for(int t = 0; t < lotto_answer.length; t++)
	    {	        	
			do { 
				int y = t+1;
				//temp = JOptionPane.showInputDialog(y + "��° �ζ� ���ڸ� �Է����ּ���."); 
				System.out.println("\n" + y + "��° �ζ� ���ڸ� �Է����ּ���.");
				//try {
					//temp = System.in.read();
				//} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
				//System.in.read();
				
		        Scanner scan = new Scanner(System.in);      // ���� �Է��� ���ڷ� Scanner ����
								
		        temp = scan.nextInt();        // Ű���� ���� ���� �Է�
				
				
	             // ����ڰ� ��ҹ�ư�� �����ų� -1�� �Է��ϸ� do-while���� �����. 
				if(temp == -1) break;       
	
				System.out.println("�Է°� : " + temp); 
	
				// ������Է��� ���ڿ��� �޾ƿ��� ������ int�� ��ȯ�� �־���Ѵ�. 
				//input = Integer.parseInt(temp); 
	
				if(temp == lotto_answer[t]) {
					System.out.println(y + "���� ���ڸ� ������ϴ�.");                   
					break;             // do-while���� �����. 
					//if(z >= 5) break;					
				}
				else
				{
					System.out.println(y + "���� ���ڰ� Ʋ�Ƚ��ϴ�. �ٽ��ѹ� �Է����ּ���");
					//z = z - 1;
					//if(z < 0) z = 0;
				}
				
			} while(true);             // ���ѹݺ��� 
		
	    }
	    
		System.out.println("�ζ� ��ȣ ���߱Ⱑ ����Ǿ����ϴ�.");	    
		
	}

}
