package multithreading;

//Multithreading using Runnable Interface

public class ThreadUsingInterface {

	public static void main(String[] args) throws InterruptedException {
		Runnable obj1 = new Hola();
		Runnable obj2 = new Ciao();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		t1.start();
		Thread.sleep(10);
		t2.start();
	}
}

class Hola implements Runnable{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Ciao implements Runnable{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("Ciao");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
