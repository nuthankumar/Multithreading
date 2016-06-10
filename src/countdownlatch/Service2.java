package countdownlatch;

import java.util.concurrent.CountDownLatch;

	public class Service2 implements Runnable{
		
		private CountDownLatch cdl=null;
		private String name="";
		Service2(CountDownLatch cdl,String name){
			this.cdl=cdl;
			this.name=name;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("service running  "+name+"..is up");
			cdl.countDown();

		}
		}
