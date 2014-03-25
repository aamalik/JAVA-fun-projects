/**
 * @author Asfandyar Ashraf Malik
 * @quiz_number 6
 * @problem_number 2
 */

public class Consumer extends Thread {
	
	private QueueThread queue;
	
	public Consumer(QueueThread queue) {
		this.queue = queue;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (queue.size() > 0) {
				String s = queue.remove();
				System.out.println("Remove " + s); //time stamps used here
			
			} else {
				try {
					sleep(10);
				} catch (InterruptedException e) {
					System.out.printf("Error");
				}
			}
		}
	}
}
