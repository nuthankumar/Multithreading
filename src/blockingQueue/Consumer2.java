package blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer2 implements Runnable{
	private BlockingQueue bq=null;

	Consumer2 (BlockingQueue bq){
		this.bq=bq;
	}

	@Override
	public void run() {
	try {
		//Thread.sleep(10000);
		
		System.out.println("element cmming Consumer2 out"+bq.take());
		System.out.println("element cmming Consumer2 out"+bq.take());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
