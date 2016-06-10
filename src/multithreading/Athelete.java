package multithreading;

public class Athelete implements Runnable {
	
	
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
	public static void main(String args[]){
		Athelete a1= new Athelete();
		Thread t1 =new Thread(a1);
		t1.start();
		
		Thread t2 = new Thread (new Runnable() {
			
			@Override
			public void run() {
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
		});
		

		t2.start();
	}
}
