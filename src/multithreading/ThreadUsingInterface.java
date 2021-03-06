package multithreading;

//Multithreading using Runnable Interface

public class ThreadUsingInterface {

	public static void main(String[] args) throws InterruptedException {
		Runnable obj1 = new Hola();
		Runnable obj2 = new Ciao();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		
//		t1.setPriority(1);
//		t2.setPriority(10);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		Thread.sleep(10);
		t2.start();
		
		System.out.println(t1.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");
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
