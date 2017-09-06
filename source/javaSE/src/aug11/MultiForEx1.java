package aug11;

class MultiForEx1 {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 9 ; i++){ //9
			for(int j = 2 ; j <= 9 ; j++){ //8
				System.out.print(j + "*" + i + "=" + i*j +"\t");
			}
			System.out.println();
		}
		// i =1 j = 2,3,4,5,6,7,8,9
		// i =2 j = 2,3,4,5,6,7,8,9
		// i =3 j = 2,3,4,5,6,7,8,9
		// i =4 j = 2,3,4,5,6,7,8,9
		// i =5 j = 2,3,4,5,6,7,8,9
		// i =6 j = 2,3,4,5,6,7,8,9
		// i =7 j = 2,3,4,5,6,7,8,9
		// i =8 j = 2,3,4,5,6,7,8,9
		// i =9 j = 2,3,4,5,6,7,8,9

		char ch = 65; //'A'
		for(int i = 0; i < 5 ; i++){ //5(0 1 2 3 4)
			for(int j = 0; j < 4; j++){ //4(0 1 2 3)
				System.out.print(ch++ + "\t");
			}
			System.out.println();
		}

	}
}










