package behavior.memento;

import java.util.Date;

public class Save {
	private final String version;
	private final Date date;
	
	public Save(String version) {
		this.version = version;
		this.date = new Date();
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getVersion() {
		return version;
	}
	
	
}
