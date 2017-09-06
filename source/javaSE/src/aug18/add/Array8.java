package aug18.add;

class Array8 {
   public static void main(String[] args){
	 
		char [] a = {'C','A','F','E'};
			String[] b = {   "0000", "0001", "0010", "0011"
					   , "0100", "0101", "0110", "0111"
					   , "1000", "1001", "1010", "1011"
					   , "1100", "1101", "1110", "1111" };	      
	      
	    String result="";
	         //0부터 3가지 4번반복
	    for(int i=0;i<a.length;i++){
	    	 if(a[i]>='0' && a[i]<='9')
	    	 {
	    		result += b[a[i]-'0'];
	    	 } else {
	    		result += b[a[i]-'A'+10]; 
	    	 }
	    }
	       System.out.println(new String(a));
	       System.out.println(result);	   

   }	   
}


