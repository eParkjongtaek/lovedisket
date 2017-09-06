package aug11;
import java.io.IOException;
import java.util.Scanner;
//import javax.swing.*;             // JOptionPane클래스를 사용하기 위해서 사용. 

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
	    
	    //gameChoice1 = JOptionPane.showInputDialog("첫번째 로또 숫자를 입력해주세요."); 	    
	    
		// 1~100사이의 임의의값을 얻어서 answer에 저장한다. 
		int temp = 0;         // 사용자입력을 저장할 임시공간 
		//int input = 0;             // 사용자입력을 저장할 공간 
		
	
	    for(int t = 0; t < lotto_answer.length; t++)
	    {	        	
			do { 
				int y = t+1;
				//temp = JOptionPane.showInputDialog(y + "번째 로또 숫자를 입력해주세요."); 
				System.out.println("\n" + y + "번째 로또 숫자를 입력해주세요.");
				//try {
					//temp = System.in.read();
				//} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
				//System.in.read();
				
		        Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성
								
		        temp = scan.nextInt();        // 키보드 숫자 정수 입력
				
				
	             // 사용자가 취소버튼을 누르거나 -1을 입력하면 do-while문을 벗어난다. 
				if(temp == -1) break;       
	
				System.out.println("입력값 : " + temp); 
	
				// 사용자입력을 문자열로 받아오기 때문에 int로 변환해 주어야한다. 
				//input = Integer.parseInt(temp); 
	
				if(temp == lotto_answer[t]) {
					System.out.println(y + "번쨰 숫자를 맞췄습니다.");                   
					break;             // do-while문을 벗어난다. 
					//if(z >= 5) break;					
				}
				else
				{
					System.out.println(y + "번쨰 숫자가 틀렸습니다. 다시한번 입력해주세요");
					//z = z - 1;
					//if(z < 0) z = 0;
				}
				
			} while(true);             // 무한반복문 
		
	    }
	    
		System.out.println("로또 번호 맞추기가 종료되었습니다.");	    
		
	}

}
