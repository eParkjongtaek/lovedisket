package aug22;

class InterfaceTest3 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA(); // ��3�� Ŭ������ �޼��带 ���ؼ� �������̽� I�� ������ Ŭ������ �ν��Ͻ��� ���´�.
	}
}

 class A3 {
    void methodA() {
          I2 i = InstanceManager.getInstance();
		  i.methodB();
     }
 }

 interface I2 {
      public abstract void methodB();
 }

 class B3 implements I2 {
     public void methodB() {
          System.out.println("methodB in B class");
     }
 }

 class InstanceManager {
	public static I2 getInstance() {
		return new B3();
	}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 