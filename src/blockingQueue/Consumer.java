package blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	private BlockingQueue bq=null;

	Consumer (BlockingQueue bq){
		this.bq=bq;
	}

	@Override
	public void run() {
	try {
		//Thread.sleep(10000);
		System.out.println("element cmming Consumer out"+bq.take());
		System.out.println("element cmming Consumer out"+bq.take());
		System.out.println("element cmming Consumer out"+bq.take());
		/*System.out.println("element cmming out"+bq.take());
		System.out.println("element cmming out"+bq.take());*/
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
