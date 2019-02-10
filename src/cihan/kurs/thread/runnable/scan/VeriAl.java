package cihan.kurs.thread.runnable.scan;

import java.util.Scanner;

public class VeriAl extends Thread {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void run() {
		boolean ex=true;
		while(ex) {
			String a=sc.next();
			if(a.equals("x") || a.equals("X") ) break;
			System.out.println("VeriAl :" + a);
		
		}
	}

}
