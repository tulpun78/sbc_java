package OopConceptPart2;
public interface USBank {
	int min_bal=100;
public void credit();
public void debit();
public void transferMoney();

// only method declaration
// no method body--only method prototype
// In interface, we can declare the variables, vars are by default static in nature
// vars value will not be changed
// no static method in interface--> becoz interface is object oriented
//no main method in interface
//we can't create the object of interface-->interface is abstract in nature
}
