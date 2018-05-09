package executorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Caller {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		for(int i=0;i<5;i++){
			ex.submit(new Job(""+i));
		}
		for(int i=0;i<5;i++){
			Future<String> fx = ex.submit(new CallableEx());
			System.out.println(fx.toString());
		}
		try {
			ex.execute(new Job("nuthan"));
			ex.isTerminated();
			ex.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex.shutdown();
		System.out.println(ex.isTerminated());
	}

}
/*
ExecutorService ex = Executors.newFixedThreadPool(3);
ex.submit(new Job(""+i));
ex.awaitTermination(1, TimeUnit.HOURS);
ex.shutdown();
ex.isTerminated();
ex.execute(new Job("nuthan"));

*/