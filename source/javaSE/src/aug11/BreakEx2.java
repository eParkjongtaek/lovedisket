package aug11;

class BreakEx2 {
	public static void main(String[] args) {

		exit_For: //���̺� ����
		for(int i = 0 ; i < 3 ; i++){ //3
			for(int j = 0 ; j < 5 ; j++){ //5
				if(j == 3)
					break exit_For;
				System.out.println("i��:"+i+", j��:"+j);
			}
		}
	}
}
//i=0 j=0,1,2