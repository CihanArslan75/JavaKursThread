package cihan.kurs.thread.runnable.scan;

public class Runner {
	public static void main(String[] args) {
		
		Thread h= new Hesapla(20);
		Thread v= new VeriAl();
		h.start();
		v.start();
	}

}
