package cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PartyRocker implements Runnable{
	private CyclicBarrier cb=null;
	PartyRocker(CyclicBarrier cb){
		this.cb=cb;
	}
	@Override
	public void run(){
		System.out.println("reached central..PartyRocker1");
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		try {
			cb.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("started to bakasur..PartyRocker1");

	}

}
