package executorService;

import java.util.concurrent.Callable;

public class CallableEx implements Callable<String>{
	String obj="Nuts";

	@Override
	public String call() throws Exception {
		return obj;
	}

	public String toString() {
		return obj;
	}
}
