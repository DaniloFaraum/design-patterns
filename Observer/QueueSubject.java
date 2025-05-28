package Observer;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueSubject extends Subject<Product> implements Runnable{
	private final Queue<Product> queue = new ArrayDeque<Product>();
	private static QueueSubject subject = new QueueSubject();
	private QueueSubject() {
		Thread t = new Thread(this);
		t.start();
	}
	public static QueueSubject getInstace() {
		return subject;
	}
	public void add(Product p) {
		queue.add(p);
	}
	@Override
	public void run() {
		while (true) {
			System.out.println("Checking queue for new updates...");
			int size = queue.size();
			if (size > 0) {
				Product p = queue.poll();
				subject.notify(p);
			} else {
				try {
					Thread.sleep(9000);
				} catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
		
	}
}
