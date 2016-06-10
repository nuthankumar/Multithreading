package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	Random random= new Random();
	Object lock1=new Object();
	Object lock2=new Object();



	public  void work1(){
		synchronized (lock1) {


			list1.add(random.nextInt(100));
			//System.out.println("list1"+list1);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public  void work2(){
		synchronized (lock2) {


			list2.add(random.nextInt(100));
			//System.out.println("list2"+list2);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}	

	public void process(){
		for(int i=0;i<1000;i++){
		work1();
		work2();
		}
	}

	public void invoke(){
		long start = System.currentTimeMillis();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
					process();
			}
		});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
					process();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("list 1 size"+list1.size());
		System.out.println("list 2 size"+list2.size());
		System.out.println("time taken:"+(end-start));
		System.out.println("completed");


	}




	public static void main(String[] args){
		new Worker().invoke();

	}	


}
