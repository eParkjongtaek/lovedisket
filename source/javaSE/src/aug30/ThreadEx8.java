package aug30;

import javax.swing.JOptionPane;

 class ThreadEx8 {   //�̹� ������  ī��Ʈ �ٿ��� ���� �����ϰ� �Է��� ������ ī��Ʈ�� ���߸鼭 �޼�����µȴ�.
 
	       static boolean inputCheck = false; //�Է��� ���� �ʾҴٸ��̶�� �����Ѵ� .
	       public static void main(String []args)throws Exception{
	       
	    	   ThreadEx8_1 aa = new ThreadEx8_1();
	    	   ThreadEx8_2 bb = new ThreadEx8_2();
	       aa.start();
	       bb.start();
	    	   
	       
	    	    //���� �޼��� ���� 
	    	   
	       }
	 
}
 class ThreadEx8_1 extends Thread {
		public void run() {
			System.out.println("10�ʾȿ� ���� �Է��ؾ� �մϴ�.");  //10�� ī��Ʈ����
			String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); //�Է¹ڽ� ���� 
			ThreadEx8.inputCheck = true;   //�Է��� �޾Ҵٸ�
			System.out.println("�Է°��� " + input + "�Դϴ�."); //�Է��� 000�޾ҽ��ϴ� ���.
		}
	}

	class ThreadEx8_2 extends Thread {   
		public void run() {
			for(int i=9; i >= 0; i--) {
				if(ThreadEx8.inputCheck) return;
				System.out.println(i);
                   
				try {
					sleep(1000);
				} catch(InterruptedException e ) {}
			}
			    
			System.out.println("10�� ���� ���� �Էµ��� �ʾ� �����մϴ�.");
			System.exit(0);		
		}
	}
 