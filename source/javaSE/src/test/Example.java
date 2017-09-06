package test;

class Test2 {
    int x;
    public Test2(int x) {
    	this.x = x; 
    }
}

public class Example {
    public static void main(String args[]) {
    		Test2 x1 = new Test2(5);
    		Test2 x2 = new Test2(10);
           method(x1, x2);
           System.out.println(x1.x + ", " + x2.x);
    }
    public static void method(Test2 v1, Test2 v2) {
           v2.x = 30;
           v1=v2;
    }
}