package test;

class Test {
    String s;
    public static void main(String[] args) {
        Test t = new Test();
        t.go();
    }
    void Test() {
         s = "constructor";
    }
    void go() {
         System.out.println(s);
    }
}  
