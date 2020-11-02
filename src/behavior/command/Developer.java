package behavior.command;

public class Developer {
	Command insert;
	Command update;
	Command select;
	Command delete;
	
	public Developer(Command insert,Command update,
	Command select,	Command delete) {
		this.delete = delete;
		this.insert = insert;
		this.update = update;
		this.select = select;
	}
	public void insertRecord() {
		insert.execute();
	}
	public void updateRecord() {
		update.execute();
	}
	public void selectRecord() {
		select.execute();
	}
	public void deleteRecord() {
		delete.execute();
	}
}
