package aug14;

class Tv3 { 
     // Tv의 속성(멤버변수) 
     String color;            	// 색상 
     boolean power;           	// 전원상태(on/off) 
     int channel;            	// 채널 

     // Tv의 기능(메서드) 
     void power() {   power = !power; }   /* TV를 켜거나 끄는 기능을 하는 메서드 */ 
     void channelUp() {     ++channel; }   /* TV의 채널을 높이는 기능을 하는 메서드 */
     void channelDown() {    --channel; } /* TV의 채널을 낮추는 기능을 하는 메서드 */ 
}

class TvTest3 {
	public static void main(String args[]) {
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");

		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
}




















