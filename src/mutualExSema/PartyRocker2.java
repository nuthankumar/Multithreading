package mutualExSema;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PartyRocker2 implements Runnable{
	private CyclicBarrier cb=null;
	PartyRocker2(CyclicBarrier cb){
		this.cb=cb;
	}
	@Override
	public void run(){
		System.out.println("reached central..PartyRocker2");
		
		try {
			cb.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("started to bakasur..PartyRocker2");

	}

}
