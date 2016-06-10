package multithreading;

public class Runner extends Thread {
	
	public void run(){
		for (int i=0; i<10; i++){
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	/*public void start(){
		System.out.println("doesnot start");
	}*/
 
	public static void main(String args[]){
		Runner r1=  new Runner();
		r1.start();
		Runner r2=  new Runner();
		r2.start();
		try {
			r1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			r2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed");
	}
}
