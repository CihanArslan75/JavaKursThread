package cihan.kurs.thread.runnable.ornek2;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Program Başladı");
		Thread t = new Calistir("Thread 1");
		Thread t1 = new Calistir("Thread 2");
		t.start();
		t1.start();
		System.out.println("Program bitti");

	}

}
