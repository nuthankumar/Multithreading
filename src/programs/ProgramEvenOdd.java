package programs;

public class ProgramEvenOdd {
	


		 static Object lock = new Object();

		    public static void main(String[] args) {
		        Thread t1 = new Thread(new Runnable() {
		            public void run() {
		                for (int itr = 1; itr < 10; itr = itr + 2) {
		                    synchronized (lock) {
		                        System.out.print(" t1 " + itr);
		                        try {
		                            lock.notify();
		                            lock.wait();
		                        } catch (InterruptedException e) {
		                            e.printStackTrace();
		                        }
		                    }
		                }
		            }
		        });
		        Thread t2 = new Thread(new Runnable() {
		            public void run() {

		                for (int itr = 2; itr < 11; itr = itr + 2) {
		                    synchronized (lock) {
		                        System.out.print(" t2 " + itr);
		                        try {
		                            lock.notify();
		                            if(itr==10)
		                                break;
		                            lock.wait();
		                        } catch (InterruptedException e) {
		                            e.printStackTrace();
		                        }
		                    }
		                }
		            }
		        });
		        try {
		            t1.start();
		            t2.start();
		            t1.join();
		            t2.join();
		            
		            System.out.println("\nPrinting over");
		        } catch (Exception e) {

		        }
		    }
		

}
