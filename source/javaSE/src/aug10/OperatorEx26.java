package aug10;

class OperatorEx26 
{ 
      public static void main(String[] args) 
      { 
            int x = 3;  //0011
            int y = 5;  //0101

            System.out.println("x�� " + x + "�̰�, y�� " + y +"�� ��, "); 
            System.out.println("x | y = " + (x|y)); //0111 7
            System.out.println("x & y = " + (x&y)); //0001 1
            System.out.println("x ^ y = " + (x^y)); // 0110 6

            System.out.println("true | false = " + (true|false)); 
            System.out.println("true & false = " + (true&false)); 
            System.out.println("true ^ false = " + (true^false)); 
      } 
} 