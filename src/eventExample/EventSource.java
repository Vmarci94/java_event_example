package eventExample;

import java.io.IOException;
import java.util.Observable;

public class EventSource extends Observable implements Runnable {

	public EventSource(){
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		int inputCharacterInInteger;
		try {
			while((inputCharacterInInteger = System.in.read()) != -1) {
			    if (inputCharacterInInteger != '\n' && inputCharacterInInteger != '\r'){
			    	setChanged();
			    	notifyObservers((char)inputCharacterInInteger);
			    }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
