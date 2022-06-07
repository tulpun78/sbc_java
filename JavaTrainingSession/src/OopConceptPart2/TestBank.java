package OopConceptPart2;

public class TestBank {

	public static void main(String[] args) {
System.out.println(USBank.min_bal);
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carloan();
	
		// dynamic polymorphism-->child class object can be referred by the parent interface ref vars
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
	// not allowed	b.educationloan();
	// not allowed	b.carloan();
	}

}
