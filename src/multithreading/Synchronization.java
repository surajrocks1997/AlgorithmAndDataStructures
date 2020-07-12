package multithreading;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
//		c.increment();
//		System.out.println(c.count);

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(c.count);
	}
}

class Counter {

	int count;

	public synchronized void increment() {
		count++;
	}
}