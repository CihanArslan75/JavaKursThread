package cihan.kurs.thread.runnable.scan;

public class Hesapla extends Thread {
	
	private int sayi=0;
	public Hesapla(int sayi ) {
		this.sayi=sayi;
	}
	
	@Override
	public void run() {
	for (int i = 0; i < 10; i++) {
		System.out.println("Hesapla : "+(sayi*i));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	    
	}

}
