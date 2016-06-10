package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		CountDownLatch cdl=new CountDownLatch(5);
		Thread t1=new Thread(new Service1(cdl,"service1"));
		Thread t2=new Thread(new Service2(cdl,"service2"));
		Thread t3=new Thread(new Service3(cdl,"service3"));
		t1.start();
		t2.start();
		t3.start();
		
		cdl.await();
		//Thread.sleep(140);
		System.out.println("all the services are up");
	}

}
