package aug18;

class ObjArrayEx1 {
	public static void main(String[] args){
		String[] arr; //��ü���迭 ����
		arr = new String[3]; //��ü���迭 ����

		arr[0] = "Java ";
		arr[1] = "Array ";
		arr[2] = "Test";
		//arr[3] = "SSOL";

		for(int i = 0 ; i < arr.length ; i++)
			System.out.println("arr["+i+"]="+arr[i]);
	}
 }
