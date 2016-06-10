package blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class appClass {

	public static void main(String[] args) {
		BlockingQueue bq = new ArrayBlockingQueue(3);
		new Thread(new Proceedure(bq)).start();
		new Thread(new Consumer(bq)).start();
		new Thread(new Consumer2(bq)).start();
		// System.out.println("completred;");
	}

}
