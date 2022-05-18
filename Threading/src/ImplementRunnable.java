class B implements Runnable {
	public void run() {
		for (int i = 0; i <1; i++) {
			System.out.println("Reddy");

		}
	}
}

public class ImplementRunnable {
	public static void main(String[] args) throws InterruptedException {
		int a=2;
		B s = new B();
		Thread t = new Thread(s);
		t.start();
		Thread.sleep(5000);
		while( a<5) {
			System.out.println("Akash");
			

		}

	}

}
