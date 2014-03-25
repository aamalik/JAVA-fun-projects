/**
 * @author Asfandyar Ashraf Malik
 * @quiz_number 6
 * @problem_number 2
 */

import java.util.Date;

public class Producer extends Thread {
	
	private QueueThread queue;
	
	public Producer(QueueThread queue) {
		this.queue = queue;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (queue.size() < 10) {
				System.out.println("Add String");
				Date date = new Date();
				String str = String.format("Current Date/Time : %tc", date );
				queue.add(str);
			
			} 
			else {
				try {
					sleep(10);
				} catch (InterruptedException e) {
					System.out.printf("Error");
				}
		  }
	   }
	}
}
