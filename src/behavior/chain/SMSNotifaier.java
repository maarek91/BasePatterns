package behavior.chain;

public class SMSNotifaier extends Notifaier {

	public SMSNotifaier(int priority) {
		super(priority);
		
	}

	@Override
	public void write(String message) {
		System.out.println("Sending SMS to manager: " + message);
	}
	
	
}
