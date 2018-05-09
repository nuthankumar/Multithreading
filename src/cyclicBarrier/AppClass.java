package cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class AppClass {

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(2);
		new Thread(new PartyRocker(cb)).start();
		new Thread(new PartyRocker2(cb)).start();
	}
}
