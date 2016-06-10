package multithreading;

import java.util.Scanner;

public class Myclass implements Runnable {
	private boolean running =true;
	public void run(){
		System.out.println(running);
		while (running){
			System.out.println("Hi");
		}
		System.out.println(running);

	}
	
	
	public void shut(){
		running=false;
	}
	
	
	public static void main(String[] args){
		Myclass run = new Myclass();
		Thread t1= new Thread(run);
		t1.start();
		Scanner sacnner=new Scanner(System.in);
		sacnner.nextLine();
		run.shut();
		sacnner.close();
	}

}
