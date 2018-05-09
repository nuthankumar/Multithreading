package executorService;

public class Job implements Runnable{

	private String name;
	
	Job(String name){
		this.name=name;
	}
	public void run() {
		System.out.println("job  " + name +"  is Started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("job  " + name +"  is Ended");
/////
		//// trdyi
	}

}
