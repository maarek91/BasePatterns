package structural.bridge;

public class BankSystem extends Program {

	protected BankSystem(Developer developer) {
		super(developer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void decelopProgram() {
		System.out.println("Bank system development in progress...");
		developer.writeCode();
	}

}
