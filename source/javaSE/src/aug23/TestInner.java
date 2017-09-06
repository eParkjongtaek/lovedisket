package aug23;


public class TestInner {

     int i;

     public TestInner() {

          System.out.println("바깥클래스 생성자");

     }// TestInner

     public void outMethod() {

          System.out.println("바깥클래스의 메서드");

     }

     // //////////Inner Class의 시작//////////////

     public class Inner {

          int j;

          public Inner() {

               System.out.println("안쪽클래스의 생성자");

          }// Inner

          public void inMethod() {

               System.out.println("안쪽클래스의 메서드");

               System.out.println("안쪽메서드 바깥변수 i="+i);

          }

     }// class

     // //////////Inner Class의 끝//////////////

     public static void main(String[] args) {

          TestInner ti = new TestInner();

          ti.i = 10;

          // ti.j=10;//안쪽 클래스의 변수는 직접 사용 불가능

          // ti.inMethod(); //안쪽 클래스의 메서드는 직접 사용 불가능

          // 바깥클래스에서 안쪽클래스의 자원을 사용하려면 안쪽클래스를 

          // 객체화하여 사용

          TestInner.Inner in = ti.new Inner();

          // 안쪽 클래스의 자원 사용

          in.j = 100;

          in.inMethod();

     }// main

}// class