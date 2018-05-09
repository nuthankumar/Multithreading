package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Service1 implements Runnable {
	private CountDownLatch cdl = null;
	private String name = "";

	Service1(CountDownLatch cdl, String name) {
		this.cdl = cdl;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("service running  " + name + "..is up");
		try {
			Thread.sleep(5000);
			cdl.countDown();
			cdl.countDown();
			cdl.countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//cdl.countDown();

	}
}
