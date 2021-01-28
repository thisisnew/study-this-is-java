package ch15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSms", "아무개"));
		messageQueue.offer(new Message("sendKakao", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			System.out.println(message.command + "," + message.to);
		}
	}
}
