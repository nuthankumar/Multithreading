package multithreading;

public class SyncRunner {
	private int Count=0;

	public void dosomework(){

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i= 0; i <1000;i++){
					getCount();
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i= 0; i <1000;i++){
					getCount();
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	public synchronized int getCount(){
		return Count++;
	}
	public static void main(String[] args){
		SyncRunner sync = new SyncRunner();
		long start = System.currentTimeMillis();
		sync.dosomework();
		long end = System.currentTimeMillis();
		System.out.println("total time taken"+(end-start));
		System.out.println(sync.getCount());
	}



}


