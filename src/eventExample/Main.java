package eventExample;

import java.util.Observable;
import java.util.Observer;

public class Main {

	
	public static void main(String[] args) {
		System.out.println("Enter Text: ");
	    EventSource eventSource = new EventSource();

	    eventSource.addObserver(new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				// TODO Auto-generated method stub
			    System.out.println("Received response: " + arg);	
			}
		});
	    new Thread(eventSource).start();
		
	}
}
