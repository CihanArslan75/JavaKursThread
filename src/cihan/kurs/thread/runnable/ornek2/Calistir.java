package cihan.kurs.thread.runnable.ornek2;

public class Calistir extends Thread{
	
	public Calistir(String isim) {
		this.setName(isim);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName()+" "+ i);
		}
	}
}
