package aug11;

class BreakEx1 {
	public static void main(String[] args) {

		for(int i = 0 ; i < 3 ; i++){ //3(0 1 2)
			for(int j = 0 ; j < 5 ; j++){ //5(0 1 2 3 4)
				if(j == 3)
					break;
				System.out.println("i°ª:"+i+", j°ª:"+j);
			}
		}
	}
}
//i=0 j=0,1,2 i=1 j=0,1,2 i=2 j=0,1,2