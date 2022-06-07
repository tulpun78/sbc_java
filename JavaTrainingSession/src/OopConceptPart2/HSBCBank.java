package OopConceptPart2;

public class HSBCBank implements USBank{
	// if a class is implementing any interface, then it is mandatory to define or override all the methods of interface
	public void credit() {
		System.out.println("hsbc---credit");
	}
	public void debit() {
		System.out.println("hsbc---debit");
	}
	public void transferMoney() {
		System.out.println("hsbc---transferMoney");
	}
	public void educationLoan() {
		System.out.println("hsbc---education loan");
	}
	public void carloan() {
		System.out.println("hsbc---carloan");
	}
}
