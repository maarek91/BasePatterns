package behavior.visitor;

public class Test implements ProjectElement{

	@Override
	public void beWritten(Developer developer) {
		developer.create(this);
	}

}