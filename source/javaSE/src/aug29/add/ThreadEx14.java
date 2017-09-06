package aug29.add;

class ThreadEx14 {
	public static void main(String args[]) {
		ThreadEx14_1 th1 = new ThreadEx14_1();
		ThreadEx14_2 th2 = new ThreadEx14_2();

		th1.start();
		th2.start();
		try {
			th1.join();
		} catch(InterruptedException e) {}
		
	}
}

class ThreadEx14_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
		}
		/*
		try {
			Thread.sleep(500);
		} catch(InterruptedException e) {}				
		*/
	}
}

class ThreadEx14_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
		}
		/*
		try {
			Thread.sleep(500);
		} catch(InterruptedException e) {}						
		*/
	}
}