package aug10;

class OperatorEx14 { 
      public static void main(String[] args) { 
			char c1 = 'a'; //97

			char c2 =  (char) (1 + c1);           // 라인 5 : 컴파일 에러발생!!!
			char c3 = 'a'+1;           // 라인 6 : 컴파일 에러없음

            System.out.println(c2); 
      } 
}
