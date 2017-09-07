package aug23;

class InnerEx1 { 
      class InstanceInner { 
            int iv = 100; 
            //static int cv = 100;             // ����! static������ ������ �� ����. 
            final static int CONST = 100;   // static final�� ����̹Ƿ� ����Ѵ�. 

      } 

      static class StaticInner { 
            int iv = 200; 
            static int cv = 200;       // staticŬ������ static����� ������ �� �ִ�. 
      } 

      void myMethod() { 
            class LocalInner { 
                  int iv = 300; 
//                static int cv = 300;             // ����! static������ ������ �� ����. 
                  final static int CONST = 300; // static final�� ����̹Ƿ� ��� 
            } 
      } 

      public static void main(String args[]) { 
            System.out.println(InstanceInner.CONST); 
            System.out.println(StaticInner.cv); 
      } 
} 










