package aug11;

class GuguDanEx1 {
	public static void main(String[] args) {

		int dan = Integer.parseInt(args[0]);
		System.out.println(dan+"��");
		System.out.println("----------");
		for(int i = 1 ; i <= 9 ; i++){
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
}
