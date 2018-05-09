package multithreading;
class WaitNotify implements Runnable{

	
	public static void main(String[] args) {

		Thread t1=new Thread(new WaitNotify(){
			public synchronized void produce() throws InterruptedException {
				System.out.println(" producing");
				wait();
				
				System.out.println(" After waiting");
			}
		});
		Thread t2=new Thread(new WaitNotify(){
			public synchronized void consume(){
				System.out.println(" consuming");
				//notify();
				System.out.println(" After consuming");
			}
		});
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		
		
	}
	
	}


