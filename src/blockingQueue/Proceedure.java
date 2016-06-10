package blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Proceedure implements Runnable{
private BlockingQueue bq=null;

Proceedure (BlockingQueue bq){
	this.bq=bq;
}

@Override
public void run() {
	try {
		int num=1;
		bq.put(num);
		System.out.println("inserting 1");
		//Thread.sleep(1000);
		num=2;
		bq.put(num);
		System.out.println("inserting 2");
		//Thread.sleep(10000);
		num=3;
		bq.put(num);
		System.out.println("inserting 3");
		//Thread.sleep(1000);
		num=4;
		bq.put(num);
		System.out.println("inserting 4");
		//Thread.sleep(1000);
		num=5;
		bq.put(num);
		System.out.println("inserting 5");
		//Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
