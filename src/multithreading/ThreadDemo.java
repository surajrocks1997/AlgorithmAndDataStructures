package multithreading;

//Multithreading using thread class

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
		Thread.sleep(10);
		obj2.start();
	}
}

class Hi extends Thread {
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
