package behavior.chain;

public abstract class Notifaier {
	private int priority;
	private Notifaier nextNotifaier;
	
	public Notifaier(int priority) {
		this.priority = priority;
	}
	
	public void setNextNotifier(Notifaier nextNotifaier) {
		this.nextNotifaier = nextNotifaier;
	}
	
	public void notifyManager(String message, int level) {
		if (level >= priority) {
			write(message);
		}
		if(nextNotifaier!=null) {
			nextNotifaier.notifyManager(message, level);
		}
	}
	
	public abstract void write(String message);
}
