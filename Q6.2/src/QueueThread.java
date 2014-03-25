/**
 * @author Asfandyar Ashraf Malik
 * @quiz_number 6
 * @problem_number 2
 */


import java.util.LinkedList;
import java.util.Queue;

public class QueueThread {
	
	private Queue<String> queue;
	
	public QueueThread() {
		queue = new LinkedList<String>();
	}
	
	synchronized public void add(String s) {
		queue.add(s);
	}
	
	synchronized public String remove() {
		return queue.remove();
	}
	
	public int size() {
		return queue.size();
	}
	
	public static void main(String[] args) {
		QueueThread aQueue = new QueueThread();
		new Producer(aQueue).start();
		new Consumer(aQueue).start();
	}
}